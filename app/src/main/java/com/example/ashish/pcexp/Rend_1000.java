package com.example.ashish.pcexp;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Rend_1000 extends AppCompatActivity implements View.OnClickListener{

    private TextView cpu1000, mobo1000, gpu1000, ram1000, ssd1000, hdd1000, psu1000;

    static final int OPENCPU_R1000_RESULT = 1 , OPENMOBO_R1000_RESULT = 2 , OPENGPU_R1000_RESULT = 3 ,
            OPENRAM_R1000_RESULT = 4 , OPENSSD_R1000_RESULT = 5 , OPENHDD_R1000_RESULT = 6 ,
            OPENPSU_R1000_RESULT = 7;

    TextView cpu, mobo, gpu, ram, ssd, hdd, psu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rend_1000);

        cpu1000 = (TextView) findViewById(R.id.proName_R1);
        cpu1000.setOnClickListener(this);

        mobo1000 = (TextView) findViewById(R.id.moboName_R1);
        mobo1000.setOnClickListener(this);

        gpu1000 = (TextView) findViewById(R.id.gpuName_R1);
        gpu1000.setOnClickListener(this);

        ram1000 = (TextView) findViewById(R.id.ramName_R1);
        ram1000.setOnClickListener(this);

        ssd1000 = (TextView) findViewById(R.id.ssdName_R1);
        ssd1000.setOnClickListener(this);

        hdd1000 = (TextView) findViewById(R.id.hddName_R1);
        hdd1000.setOnClickListener(this);

        psu1000 = (TextView) findViewById(R.id.psuName_R1);
        psu1000.setOnClickListener(this);


//        cpu = (TextView) findViewById(R.id.proNameR1000);
//        cpu.setText(getIntent().getStringExtra("Processor"));
//
//        mobo = (TextView) findViewById(R.id.moboNameR1000);
//        mobo.setText(getIntent().getStringExtra("Motherboard"));
//
//        gpu = (TextView) findViewById(R.id.gpuNameR1000);
//        gpu.setText(getIntent().getStringExtra("GPU"));
//
//        ram = (TextView) findViewById(R.id.ramNameR1000);
//        ram.setText(getIntent().getStringExtra("RAM"));
//
//        ssd = (TextView) findViewById(R.id.ssdNameR1000);
//        ssd.setText(getIntent().getStringExtra("SSD"));
//
//        hdd = (TextView) findViewById(R.id.hddNameR1000);
//        hdd.setText(getIntent().getStringExtra("HDD"));
//
//        psu = (TextView) findViewById(R.id.psuNameR1000);
//        psu.setText(getIntent().getStringExtra("PSU"));

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case OPENCPU_R1000_RESULT:
                cpu = (TextView) findViewById(R.id.proNameR1000);
                cpu.setText(data.getStringExtra("Processor"));
                break;

            case OPENMOBO_R1000_RESULT:
                mobo = (TextView) findViewById(R.id.moboNameR1000);
                mobo.setText(data.getStringExtra("Motherboard"));
                break;

            case OPENGPU_R1000_RESULT:
                gpu = (TextView) findViewById(R.id.gpuNameR1000);
                gpu.setText(data.getStringExtra("GPU"));
                break;

            case OPENRAM_R1000_RESULT:
                ram = (TextView) findViewById(R.id.ramNameR1000);
                ram.setText(data.getStringExtra("RAM"));
                break;

            case OPENSSD_R1000_RESULT:
                ssd = (TextView) findViewById(R.id.ssdNameR1000);
                ssd.setText(data.getStringExtra("SSD"));
                break;

            case OPENHDD_R1000_RESULT:
                hdd = (TextView) findViewById(R.id.hddNameR1000);
                hdd.setText(data.getStringExtra("HDD"));
                break;

            case OPENPSU_R1000_RESULT:
                psu = (TextView) findViewById(R.id.psuNameR1000);
                psu.setText(data.getStringExtra("PSU"));
                break;
        }

    }

    @Override
    public void onClick(View v) {

        if (v == cpu1000) {
            opencpu_r1000();
        }
        else if (v == mobo1000) {
            openmobo_r1000();
        }
        else if (v == gpu1000) {
            opengpu_r1000();
        }
        else if (v == ram1000) {
            openram_r1000();
        }
        else if (v == ssd1000) {
            openssd_r1000();
        }
        else if (v == hdd1000) {
            openhdd_r1000();
        }
        else if (v == psu1000) {
            openpsu_r1000();
        }
    }

    public void opencpu_r1000() {
        Intent intent = new Intent(this, cpu_r1000.class);
//        startActivity(intent);
        startActivityForResult(intent, OPENCPU_R1000_RESULT);
    }

    public void openmobo_r1000() {
        Intent intent = new Intent(this, mobo_r1000.class);
        startActivityForResult(intent, OPENMOBO_R1000_RESULT);
//        startActivity(intent);
    }

    public void opengpu_r1000() {
        Intent intent = new Intent(this, gpu_r1000.class);
        startActivityForResult(intent, OPENGPU_R1000_RESULT);
//        startActivity(intent);
    }

    public void openram_r1000() {
        Intent intent = new Intent(this, ram_r1000.class);
        startActivityForResult(intent, OPENRAM_R1000_RESULT);
//        startActivity(intent);
    }

    public void openssd_r1000() {
        Intent intent = new Intent(this, ssd_r1000.class);
        startActivityForResult(intent, OPENSSD_R1000_RESULT);
//        startActivity(intent);
    }

    public void openhdd_r1000() {
        Intent intent = new Intent(this, hdd_r1000.class);
        startActivityForResult(intent, OPENHDD_R1000_RESULT);
//        startActivity(intent);
    }

    public void openpsu_r1000() {
        Intent intent = new Intent(this, psu_r1000.class);
        startActivityForResult(intent, OPENPSU_R1000_RESULT);
//        startActivity(intent);
    }

}