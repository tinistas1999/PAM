package com.example.aleksandra_wesolowska_pam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Results extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wyniki);
        Button result = (Button) findViewById(R.id.PrzyciskPowrot);
        result.setOnClickListener(przyciskReturn);
        Intent obliczenia1 = getIntent();
        double pozostalyLakier = obliczenia1.getDoubleExtra("pozostalylakier", 0.0);
        double pozostaleStylizacje = obliczenia1.getDoubleExtra("pozostalestylizacje", 0.0);
        TextView wynik1 = (TextView) findViewById(R.id.Wynik1);
        TextView wynik2 = (TextView) findViewById(R.id.Wynik2);
        wynik1.setText(String.valueOf(pozostalyLakier));
        wynik2.setText(String.valueOf(pozostaleStylizacje));
    }

    private View.OnClickListener przyciskReturn= new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity();
        }
    };

    private void startActivity() {
        Intent przyciskpowrot = getIntent();
        TextView wynik1 = (TextView) findViewById(R.id.Wynik1);
        TextView wynik2 = (TextView) findViewById(R.id.Wynik2);
        przyciskpowrot.putExtra("nailpolishValue","How much nail polish is left in the bottle: " + wynik1.getText().toString() );
        przyciskpowrot.putExtra("personValue","Remaining amount of nail polish per person: " + wynik2.getText().toString() );
        setResult(RESULT_OK,przyciskpowrot);
        finish();
    }

}
