package com.example.ashish.pcexp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class hdd_r1000 extends AppCompatActivity {

    Button button_save;
    RadioGroup rG;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hdd_r1000);

        button_save = (Button) findViewById(R.id.Save_R1_hdd);
        rG = (RadioGroup) findViewById(R.id.hdd_RadioGrp);
        tv = (TextView) findViewById(R.id.hddNameR1000);

        button_save.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                int selected_hdd= rG.getCheckedRadioButtonId();
                RadioButton selectedRadioButton = (RadioButton) findViewById(selected_hdd);

                String radioValue = selectedRadioButton.getText().toString();
                Intent intent = new Intent(hdd_r1000.this, Rend_1000.class);
                intent.putExtra("HDD", radioValue);

                startActivity(intent);


            }

        });
    }
}
