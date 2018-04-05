package com.example.ashish.pcexp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private static int SPLASH_TIME_OUT = 2500;

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private Button BtnShowDialog;

    EditText rigName;
    Spinner typeSpinner;
    Spinner priceSpinner;
    Button mBuildrig;

    DatabaseReference databaseRigSaves;

    ListView listViewSaves;
    List<RigSaves> saveslist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseRigSaves = FirebaseDatabase.getInstance().getReference("rigsaves");

        listViewSaves = (ListView) findViewById(R.id.listViewSaves);
        saveslist = new ArrayList<>();

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        Button mShowDialog = (Button) findViewById(R.id.BtnShowDialog);
        mShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog, null);

                mBuildrig = (Button) mView.findViewById(R.id.btnBuild);
                rigName = (EditText) mView.findViewById(R.id.rigName);
                typeSpinner = (Spinner) mView.findViewById(R.id.typeSpinner);
                priceSpinner = (Spinner) mView.findViewById(R.id.priceSpinner);

                mBuildrig.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addRig();
                    }
                });

                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();
            }
        });


        listViewSaves.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                RigSaves rigSaves = saveslist.get(position);

                // Gaming option
                if( rigSaves.getRigType().equals("Gaming") && rigSaves.getRigPrice().equals("Under 500") ){
                    Intent myIntent = new Intent(MainActivity.this, Game_500.class);
                    startActivity(myIntent);
                }

                if( rigSaves.getRigType().equals("Gaming") && rigSaves.getRigPrice().equals("Under 1000") ){
                    Intent myIntent = new Intent(MainActivity.this, Game_1000.class);
                    startActivity(myIntent);
                }

                if( rigSaves.getRigType().equals("Gaming") && rigSaves.getRigPrice().equals("Over 1000") ){
                    Toast.makeText(getApplicationContext(), "Gaming - Over 1000 not available currently.", Toast.LENGTH_SHORT).show();
                }

                // Rendering option
                if( rigSaves.getRigType().equals("Rendering") && rigSaves.getRigPrice().equals("Under 500") ){

                    Toast.makeText(getApplicationContext(), "Rendering - Under 500 not available.", Toast.LENGTH_SHORT).show();

                }

                if( rigSaves.getRigType().equals("Rendering") && rigSaves.getRigPrice().equals("Under 1000") ){

                    Intent myIntent = new Intent(MainActivity.this, Rend_1000.class);
                    startActivity(myIntent);

                }

                if( rigSaves.getRigType().equals("Rendering") && rigSaves.getRigPrice().equals("Over 1000") ){

                    Toast.makeText(getApplicationContext(), "Rendering Over 1000.", Toast.LENGTH_SHORT).show();
                }

            }
        });


//        listViewSaves.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
//
//                if (position == 0) {
//                    Intent myIntent = new Intent(MainActivity.this, Game_500.class);
//                    MainActivity.this.startActivity(myIntent);
//                }
//                if (position == 1) {
//                    Intent myIntent = new Intent(MainActivity.this, Game_1000.class);
//                    MainActivity.this.startActivity(myIntent);
//                }
//                if (position == 2) {
//                    Toast.makeText(getApplicationContext(), "Your toast message3.",
//                            Toast.LENGTH_SHORT).show();
//                }
//
//                if (position == 3) {
//                    Toast.makeText(getApplicationContext(), "Your toast message4.",
//                            Toast.LENGTH_SHORT).show();
//                }
//
//                if (position == 4) {
//                    Toast.makeText(getApplicationContext(), "Your toast message5.",
//                            Toast.LENGTH_SHORT).show();
//                }
//
//                if (position == 5) {
//                    Toast.makeText(getApplicationContext(), "Your toast message6.",
//                            Toast.LENGTH_SHORT).show();
//                }
//
//                if (position == 6) {
//                    Toast.makeText(getApplicationContext(), "Your toast message7.",
//                            Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

    }

    @Override
    protected void onStart() {
        super.onStart();

        databaseRigSaves.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                saveslist.clear();

                for(DataSnapshot savesSnapshot : dataSnapshot.getChildren()){

                    RigSaves rigSaves = savesSnapshot.getValue(RigSaves.class);
                    saveslist.add(rigSaves);

                }

                SavesList adapter = new SavesList(MainActivity.this, saveslist);
                listViewSaves.setAdapter(adapter);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    private void addRig(){
        String name = rigName.getText().toString().trim();
        String typeRig = typeSpinner.getSelectedItem().toString();
        String priceRig = priceSpinner.getSelectedItem().toString();

        if(!TextUtils.isEmpty(name)) {

           String id = databaseRigSaves.push().getKey();

           RigSaves rigSaves = new RigSaves(id, name, typeRig, priceRig);

           databaseRigSaves.child(id).setValue(rigSaves);

           Toast.makeText(this, "Rig Saved", Toast.LENGTH_SHORT).show();

        }else{
            Toast.makeText(this, "Please fill any empty fields", Toast.LENGTH_SHORT).show();
        }

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mToggle.onOptionsItemSelected(item)){

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id =item.getItemId();

        if (id == R.id.home1)
        {
            Toast.makeText(getApplicationContext(), "Home.",
                    Toast.LENGTH_SHORT).show();

        }
        if (id == R.id.components1)
        {
            Toast.makeText(getApplicationContext(), "Components.",
                    Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.setting1)
        {
            Toast.makeText(getApplicationContext(), "Settings.",
                    Toast.LENGTH_SHORT).show();
        }
        return false;
    }

}
