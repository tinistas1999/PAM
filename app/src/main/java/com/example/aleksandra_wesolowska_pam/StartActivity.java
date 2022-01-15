package com.example.aleksandra_wesolowska_pam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);
        Button startButton = (Button) findViewById(R.id.Przycisk1);
        startButton.setOnClickListener(pierwszyP);
        Button calculation = (Button) findViewById(R.id.Przycisk2);
        calculation.setOnClickListener(przyciskdrugi);
    }

    private View.OnClickListener pierwszyP= new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            whatIsArt();
        }
    };

    private void whatIsArt() {
        Intent przycisk1 = new Intent(this, WhatIsArt.class);
        startActivity(przycisk1);
    }

    private View.OnClickListener przyciskdrugi= new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            calculations();
        }
    };

    private void calculations() {
        Intent przycisk2 = new Intent(this, Calculations.class);
        startActivity(przycisk2);
    }

}
