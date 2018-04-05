package com.example.ashish.pcexp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Game_1000 extends AppCompatActivity implements View.OnClickListener{

    private TextView cpu1000, mobo1000, gpu1000, ram1000, ssd1000, hdd1000, psu1000;
    static final int OPENCPU_G1000_RESULT = 1 , OPENMOBO_G1000_RESULT = 2 , OPENGPU_G1000_RESULT = 3 ,
                    OPENRAM_G1000_RESULT = 4 , OPENSSD_G1000_RESULT = 5 , OPENHDD_G1000_RESULT = 6 ,
                    OPENPSU_G1000_RESULT = 7;

    TextView cpu, mobo, gpu, ram, ssd, hdd, psu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_1000);

        cpu1000 = (TextView) findViewById(R.id.proName_G1);
        cpu1000.setOnClickListener(this);

        mobo1000 = (TextView) findViewById(R.id.moboName_G1);
        mobo1000.setOnClickListener(this);

        gpu1000 = (TextView) findViewById(R.id.gpuName_G1);
        gpu1000.setOnClickListener(this);

        ram1000 = (TextView) findViewById(R.id.ramName_G1);
        ram1000.setOnClickListener(this);

        ssd1000 = (TextView) findViewById(R.id.ssdName_G1);
        ssd1000.setOnClickListener(this);

        hdd1000 = (TextView) findViewById(R.id.hddName_G1);
        hdd1000.setOnClickListener(this);

        psu1000 = (TextView) findViewById(R.id.psuName_G1);
        psu1000.setOnClickListener(this);

        Button mShowDialog = (Button) findViewById(R.id.Save);
        mShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Game_1000.this);
                View mView = getLayoutInflater().inflate(R.layout.results_dialog, null);

                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();
            }
        });
    }

     @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch(requestCode) {
            case OPENCPU_G1000_RESULT:
                cpu = (TextView) findViewById(R.id.proNameG1000);
                cpu.setText(data.getStringExtra("Processor"));
                break;
            case OPENMOBO_G1000_RESULT:
                mobo = (TextView) findViewById(R.id.moboNameG1000);
                mobo.setText(data.getStringExtra("Motherboard"));
                break;
            case OPENGPU_G1000_RESULT:
                gpu = (TextView) findViewById(R.id.gpuNameG1000);
                gpu.setText(data.getStringExtra("GPU"));
                break;
            case OPENRAM_G1000_RESULT:
                ram = (TextView) findViewById(R.id.ramNameG1000);
                ram.setText(data.getStringExtra("RAM"));
                break;
            case OPENSSD_G1000_RESULT:
                ssd = (TextView) findViewById(R.id.ssdNameG1000);
                ssd.setText(data.getStringExtra("SSD"));
                break;
            case OPENHDD_G1000_RESULT:
                hdd = (TextView) findViewById(R.id.hddNameG1000);
                hdd.setText(data.getStringExtra("HDD"));
                break;
            case OPENPSU_G1000_RESULT:
                psu = (TextView) findViewById(R.id.psuNameG1000);
                psu.setText(data.getStringExtra("PSU"));
                break;

        }
    }

    @Override
    public void onClick(View v) {

        if (v == cpu1000) {
            opencpu_g1000();
        }
        else if (v == mobo1000) {
            openmobo_g1000();
        }
        else if (v == gpu1000) {
            opengpu_g1000();
        }
        else if (v == ram1000) {
            openram_g1000();
        }
        else if (v == ssd1000) {
            openssd_g1000();
        }
        else if (v == hdd1000) {
            openhdd_g1000();
        }
        else if (v == psu1000) {
            openpsu_g1000();
        }
    }

    public void opencpu_g1000() {
        Intent intent = new Intent(this, cpu_g1000.class);
         startActivityForResult(intent, OPENCPU_G1000_RESULT);
    }

    public void openmobo_g1000() {
        Intent intent = new Intent(this, mobo_g1000.class);
        startActivityForResult(intent, OPENMOBO_G1000_RESULT);
    }

    public void opengpu_g1000() {
        Intent intent = new Intent(this, gpu_g1000.class);
        startActivityForResult(intent, OPENGPU_G1000_RESULT);
    }

    public void openram_g1000() {
        Intent intent = new Intent(this, ram_g1000.class);
        startActivityForResult(intent, OPENRAM_G1000_RESULT);
    }

    public void openssd_g1000() {
        Intent intent = new Intent(this, ssd_g1000.class);
        startActivityForResult(intent, OPENSSD_G1000_RESULT);
    }

    public void openhdd_g1000() {
        Intent intent = new Intent(this, hdd_g1000.class);
        startActivityForResult(intent, OPENHDD_G1000_RESULT);
    }

    public void openpsu_g1000() {
        Intent intent = new Intent(this, psu_g1000.class);
        startActivityForResult(intent, OPENPSU_G1000_RESULT);
    }

}
