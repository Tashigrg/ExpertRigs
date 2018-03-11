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

    TextView cpu, mobo, gpu, ram, ssd, hdd, psu;

    final int PROCESSOR_SELECTION_CODE = 0;

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


        cpu = (TextView) findViewById(R.id.proNameG1000);
        cpu.setText(getIntent().getStringExtra("Processor"));

        mobo = (TextView) findViewById(R.id.moboNameG1000);
        mobo.setText(getIntent().getStringExtra("Motherboard"));

        gpu = (TextView) findViewById(R.id.gpuNameG1000);
        gpu.setText(getIntent().getStringExtra("GPU"));

        ram = (TextView) findViewById(R.id.ramNameG1000);
        ram.setText(getIntent().getStringExtra("RAM"));

        ssd = (TextView) findViewById(R.id.ssdNameG1000);
        ssd.setText(getIntent().getStringExtra("SSD"));

        hdd = (TextView) findViewById(R.id.hddNameG1000);
        hdd.setText(getIntent().getStringExtra("HDD"));

        psu = (TextView) findViewById(R.id.psuNameG1000);
        psu.setText(getIntent().getStringExtra("PSU"));

    }

//    @Override
//    public void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//
//        switch(requestCode) {
//            case (PROCESSOR_SELECTION_CODE) : {
//                if (resultCode == Activity.RESULT_OK) {
//                    // TODO Extract the data returned from the child Activity.
//                    String radioValue = data.getStringExtra("ProcessorSelection");
//                    // save the result value and update UI
//                }
//                break;
//            }
//        }
//    }

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
//        startActivityForResult(intent, PROCESSOR_SELECTION_CODE);
        startActivity(intent);

    }

    public void openmobo_g1000() {
        Intent intent = new Intent(this, mobo_g1000.class);
        startActivity(intent);
    }

    public void opengpu_g1000() {
        Intent intent = new Intent(this, gpu_g1000.class);
        startActivity(intent);
    }

    public void openram_g1000() {
        Intent intent = new Intent(this, ram_g1000.class);
        startActivity(intent);
    }

    public void openssd_g1000() {
        Intent intent = new Intent(this, ssd_g1000.class);
        startActivity(intent);
    }

    public void openhdd_g1000() {
        Intent intent = new Intent(this, hdd_g1000.class);
        startActivity(intent);
    }

    public void openpsu_g1000() {
        Intent intent = new Intent(this, psu_g1000.class);
        startActivity(intent);
    }

}