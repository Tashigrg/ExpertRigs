package com.example.ashish.pcexp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class gpu_r1000 extends AppCompatActivity {

    Button button_save;
    RadioGroup rG;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpu_r1000);

        button_save = (Button) findViewById(R.id.Save_R1_gpu);
        rG = (RadioGroup) findViewById(R.id.gpu_RadioGrp);
        tv = (TextView) findViewById(R.id.gpuNameR1000);

        button_save.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                int selected_gpu = rG.getCheckedRadioButtonId();
                RadioButton selectedRadioButton = (RadioButton) findViewById(selected_gpu);

                String radioValue = selectedRadioButton.getText().toString();
                Intent intent = new Intent(gpu_r1000.this, Rend_1000.class);
                intent.putExtra("GPU", radioValue);

                startActivity(intent);


            }

        });
    }
}
