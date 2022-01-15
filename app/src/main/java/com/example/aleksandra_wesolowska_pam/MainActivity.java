package com.example.aleksandra_wesolowska_pam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button startButton = (Button) findViewById(R.id.PrzyciskStartowy);
        startButton.setOnClickListener(startowyP);
    }

    private View.OnClickListener startowyP= new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity();
        }
    };

    private void startActivity() {
        Intent startt = new Intent(this, StartActivity.class);
        startActivity(startt);
    }


}