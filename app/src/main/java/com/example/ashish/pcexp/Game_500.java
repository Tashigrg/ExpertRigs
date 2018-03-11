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

    TextView cpu, mobo, gpu, ram, ssd, hdd, psu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_500);

        cpu500 = (TextView) findViewById(R.id.proName_G5);
        mobo500 = (TextView) findViewById(R.id.moboName_G5);
        gpu500 = (TextView) findViewById(R.id.gpuName_G5);
        ram500 = (TextView) findViewById(R.id.ramName_G5);
        ssd500 = (TextView) findViewById(R.id.ssdName_G5);
        hdd500 = (TextView) findViewById(R.id.hddName_G5);
        psu500 = (TextView) findViewById(R.id.psuName_G5);

        cpu500.setOnClickListener(this);
        mobo500.setOnClickListener(this);
        gpu500.setOnClickListener(this);
        ram500.setOnClickListener(this);
        ssd500.setOnClickListener(this);
        hdd500.setOnClickListener(this);
        psu500.setOnClickListener(this);


        cpu = (TextView) findViewById(R.id.proNameG500);
        cpu.setText(getIntent().getStringExtra("Processor"));


        mobo = (TextView) findViewById(R.id.moboNameG500);
        mobo.setText(getIntent().getStringExtra("Motherboard"));

        gpu = (TextView) findViewById(R.id.gpuNameG500);
        gpu.setText(getIntent().getStringExtra("GPU"));

        ram = (TextView) findViewById(R.id.ramNameG500);
        ram.setText(getIntent().getStringExtra("RAM"));

        ssd = (TextView) findViewById(R.id.ssdNameG500);
        ssd.setText(getIntent().getStringExtra("SSD"));

        hdd = (TextView) findViewById(R.id.hddNameG500);
        hdd.setText(getIntent().getStringExtra("HDD"));

        psu = (TextView) findViewById(R.id.psuNameG500);
        psu.setText(getIntent().getStringExtra("PSU"));

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
        startActivity(intent);
    }

    public void openmobo_g500() {
        Intent intent = new Intent(this, mobo_g500.class);
        startActivity(intent);
    }

    public void opengpu_g500() {
        Intent intent = new Intent(this, gpu_g500.class);
        startActivity(intent);
    }

    public void openram_g500() {
        Intent intent = new Intent(this, ram_g500.class);
        startActivity(intent);
    }

    public void openssd_g500() {
        Intent intent = new Intent(this, ssd_g500.class);
        startActivity(intent);
    }

    public void openhdd_g500() {
        Intent intent = new Intent(this, hdd_g500.class);
        startActivity(intent);
    }

    public void openpsu_g500() {
        Intent intent = new Intent(this, psu_g500.class);
        startActivity(intent);
    }

}