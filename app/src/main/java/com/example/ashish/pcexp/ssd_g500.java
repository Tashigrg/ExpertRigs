package com.example.ashish.pcexp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ssd_g500 extends AppCompatActivity {

    Button button_save;
    RadioGroup rG;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ssd_g500);

        button_save = (Button) findViewById(R.id.Save_G5_ssd);
        rG = (RadioGroup) findViewById(R.id.ssd_RadioGrp);
        tv = (TextView) findViewById(R.id.ssdNameG500);

        button_save.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                int selected_ssd= rG.getCheckedRadioButtonId();
                RadioButton selectedRadioButton = (RadioButton) findViewById(selected_ssd);

                String radioValue = selectedRadioButton.getText().toString();
                Intent intent = new Intent(ssd_g500.this, Game_500.class);
                intent.putExtra("SSD", radioValue);

                startActivity(intent);


            }

        });
    }
}
