package com.example.ashish.pcexp;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class cpu_r1000 extends AppCompatActivity {

    Button button_save;
    RadioGroup rG;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpu_r1000);

        button_save = (Button) findViewById(R.id.Save_R1_cpu);
        rG = (RadioGroup) findViewById(R.id.cpu_RadioGrp);
        tv = (TextView) findViewById(R.id.proNameR1000);

        button_save.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                int selected_cpu = rG.getCheckedRadioButtonId();
                RadioButton selectedRadioButton = (RadioButton) findViewById(selected_cpu);

                String radioValue = selectedRadioButton.getText().toString();
                Intent intent = new Intent(cpu_r1000.this, Rend_1000.class);
                intent.putExtra("Processor", radioValue);

//                startActivity(intent);
                setResult(1,intent);
                finish();

            }

        });

        Button mShowDialog = (Button) findViewById(R.id.icpu_1000r);
        mShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(cpu_r1000.this);
                View mView = getLayoutInflater().inflate(R.layout.cpudialogrend, null);

                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();
            }
        });


    }
}
