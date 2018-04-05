package com.example.ashish.pcexp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Game_500 extends AppCompatActivity implements View.OnClickListener{

    private TextView cpu500, mobo500, gpu500, ram500, ssd500, hdd500, psu500;

    static final int OPENCPU_G500_RESULT = 1 , OPENMOBO_G500_RESULT = 2 , OPENGPU_G500_RESULT = 3 ,
            OPENRAM_G500_RESULT = 4 , OPENSSD_G500_RESULT = 5 , OPENHDD_G500_RESULT = 6 ,
            OPENPSU_G500_RESULT = 7;

    TextView cpu, mobo, gpu, ram, ssd, hdd, psu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_500);

        cpu500 = (TextView) findViewById(R.id.proName_G5);
        cpu500.setOnClickListener(this);

        mobo500 = (TextView) findViewById(R.id.moboName_G5);
        mobo500.setOnClickListener(this);

        gpu500 = (TextView) findViewById(R.id.gpuName_G5);
        gpu500.setOnClickListener(this);

        ram500 = (TextView) findViewById(R.id.ramName_G5);
        ram500.setOnClickListener(this);

        ssd500 = (TextView) findViewById(R.id.ssdName_G5);
        ssd500.setOnClickListener(this);

        hdd500 = (TextView) findViewById(R.id.hddName_G5);
        hdd500.setOnClickListener(this);

        psu500 = (TextView) findViewById(R.id.psuName_G5);
        psu500.setOnClickListener(this);

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case OPENCPU_G500_RESULT:
                cpu = (TextView) findViewById(R.id.proNameG500);
                cpu.setText(data.getStringExtra("Processor"));
                break;

            case OPENMOBO_G500_RESULT:
                mobo = (TextView) findViewById(R.id.moboNameG500);
                mobo.setText(data.getStringExtra("Motherboard"));
                break;

            case OPENGPU_G500_RESULT:
                gpu = (TextView) findViewById(R.id.gpuNameG500);
                gpu.setText(data.getStringExtra("GPU"));
                break;

            case OPENRAM_G500_RESULT:
                ram = (TextView) findViewById(R.id.ramNameG500);
                ram.setText(data.getStringExtra("RAM"));
                break;

            case OPENSSD_G500_RESULT:
                ssd = (TextView) findViewById(R.id.ssdNameG500);
                ssd.setText(data.getStringExtra("SSD"));
                break;

            case OPENHDD_G500_RESULT:
                hdd = (TextView) findViewById(R.id.hddNameG500);
                hdd.setText(data.getStringExtra("HDD"));
                break;

            case OPENPSU_G500_RESULT:
                psu = (TextView) findViewById(R.id.psuNameG500);
                psu.setText(data.getStringExtra("PSU"));
                break;
        }
    }

    @Override
    public void onClick(View v) {

        if (v == cpu500) {
            opencpu_g500();
        }
        else if (v == mobo500) {
            openmobo_g500();
        }
        else if (v == gpu500) {
            opengpu_g500();
        }
        else if (v == ram500) {
            openram_g500();
        }
        else if (v == ssd500) {
            openssd_g500();
        }
        else if (v == hdd500) {
            openhdd_g500();
        }
        else if (v == psu500) {
            openpsu_g500();
        }


    }

    public void opencpu_g500() {
        Intent intent = new Intent(this, cpu_g500.class);
//        startActivity(intent);
        startActivityForResult(intent, OPENCPU_G500_RESULT);
    }

    public void openmobo_g500() {
        Intent intent = new Intent(this, mobo_g500.class);
        startActivityForResult(intent, OPENMOBO_G500_RESULT);
//        startActivity(intent);
    }

    public void opengpu_g500() {
        Intent intent = new Intent(this, gpu_g500.class);
        startActivityForResult(intent, OPENGPU_G500_RESULT);
//        startActivity(intent);
    }

    public void openram_g500() {
        Intent intent = new Intent(this, ram_g500.class);
        startActivityForResult(intent, OPENRAM_G500_RESULT);
//        startActivity(intent);
    }

    public void openssd_g500() {
        Intent intent = new Intent(this, ssd_g500.class);
        startActivityForResult(intent, OPENSSD_G500_RESULT);
//        startActivity(intent);
    }

    public void openhdd_g500() {
        Intent intent = new Intent(this, hdd_g500.class);
        startActivityForResult(intent, OPENHDD_G500_RESULT);
//        startActivity(intent);
    }

    public void openpsu_g500() {
        Intent intent = new Intent(this, psu_g500.class);
        startActivityForResult(intent, OPENPSU_G500_RESULT);
//        startActivity(intent);
    }

}