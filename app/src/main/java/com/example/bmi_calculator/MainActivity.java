package com.example.bmi_calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.DragStartHelper;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView edt_result;
    LinearLayout lomain;
    EditText edtWeight,edtHightft,edtHightinch;
    Button submit_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "main OnCreate", Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_main);


    }
    @Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "main OnStart", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);

        //create variable to give reference of id of xml file activities

        edtWeight= findViewById(R.id.edtWeight);
        edtHightft= findViewById(R.id.edtHightft);
        edtHightinch= findViewById(R.id.edtHightinch);
        submit_btn= findViewById(R.id.submit_btn);
        edt_result= findViewById(R.id.edt_result);
        lomain=findViewById(R.id.lomain);

        // this below code use to perform click button activity for any button
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //it is for converting value into number because getText take value in edoitable value
                //editable-->String-->int
                int wt= Integer.parseInt(edtWeight.getText().toString());
                int hift=Integer.parseInt(edtHightft.getText().toString());
                int htich= Integer.parseInt(edtHightinch.getText().toString());

                int totalIn=hift * 12+htich;
                double cmt=totalIn*2.53;
                double meter=cmt/100;

                double bmi=wt/(meter*meter);
                if(bmi>25)
                {
                    edt_result.setText("You Are Over Weight");
                    lomain.setBackgroundColor(R.color.Red);
                } else if (bmi<18) {
                    edt_result.setText("You Are under weight");
                    lomain.setBackgroundColor(R.color.Yellow);
                } else {
                    edt_result.setText("You are Healthy");
                    lomain.setBackgroundColor(R.color.Green);
                }

            }
        });
        Toast.makeText(this, "main OnResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "main OnPause", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "main OnStop", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "main OnDestroy", Toast.LENGTH_SHORT).show();
    }
}