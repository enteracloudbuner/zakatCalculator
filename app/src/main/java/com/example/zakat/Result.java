package com.example.zakat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class Result extends AppCompatActivity {
ArrayList<Double> recData;
TextView tv_total,tv_deduction,tv_eligible_amount,tv_zakat_amount;
FloatingActionButton home,back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tv_total = findViewById(R.id.total_amount);
        tv_deduction = findViewById(R.id.deduction);
        tv_eligible_amount = findViewById(R.id.eligible_amount);
        tv_zakat_amount = findViewById(R.id.zakat_amount);


        recData = (ArrayList<Double>) getIntent().getSerializableExtra("Data");
       // textView.setText(recData.get(0)) ; --- Will get first elemnet from the array and so forth
        // Hope it work


        tv_total.setText(recData.get(0).toString());
        tv_deduction.setText(recData.get(1).toString());
        tv_eligible_amount.setText(recData.get(2).toString());
        tv_zakat_amount.setText(recData.get(3).toString());

        home=findViewById(R.id.home);
        back=findViewById(R.id.back);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Result.this,MainActivity.class);
                startActivity(intent);

            }

    });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Result.this,form.class);
                startActivity(intent);
            }
        });
}}
