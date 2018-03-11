package com.example.ashish.pcexp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class mobo_g500 extends AppCompatActivity {

    Button button_save2;
    RadioGroup rG;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobo_g500);

        button_save2 = (Button) findViewById(R.id.Save_G5_imobo);
        rG = (RadioGroup) findViewById(R.id.mobo_RadioGrp);
        tv = (TextView) findViewById(R.id.moboNameG500);

        button_save2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                int selected_mobo = rG.getCheckedRadioButtonId();

                RadioButton selectedRadioButton = (RadioButton) findViewById(selected_mobo);

                String radioValue1 = selectedRadioButton.getText().toString();
                Intent intent = new Intent(mobo_g500.this, Game_500.class);

                intent.putExtra("Motherboard", radioValue1);

                startActivity(intent);

//                int selected_cpu = rG.getCheckedRadioButtonId();
//
//                RadioButton selectedRadioButton = (RadioButton) findViewById(selected_cpu);
//                String selectedRadioButtonText = selectedRadioButton.getText().toString();
//
//                openGame_500();

//               tv.setText(selectedRadioButtonText);
//                Toast.makeText(cpu_g500.this,
//                        selectedRadioButton.getText(), Toast.LENGTH_SHORT).show();



            }

        });
    }
}
