package com.example.aleksandra_wesolowska_pam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Calculations extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.obliczenia);
        Button result = (Button) findViewById(R.id.PrzyciskOblicz);
        result.setOnClickListener(przyciskCount);
    }

    private View.OnClickListener przyciskCount= new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity();
        }
    };

    private void startActivity() {
        EditText capacity = (EditText) findViewById(R.id.Liczba1);
        EditText number = (EditText) findViewById(R.id.Liczba2);
        if(capacity.getText().toString().equals("") || number.getText().toString().equals(""))
        {
            Toast.makeText(this, "Complete the form",Toast.LENGTH_SHORT).show();
        } else{
        Intent przyciskoblicz = new Intent(this, Results.class);
        int capacityValue = Integer.parseInt(capacity.getText().toString());
        int numberValue = Integer.parseInt(number.getText().toString());
        double pozostalyLakier = capacityValue - numberValue*0.5;
        double pozostaleStylizacje = pozostalyLakier*2;
        przyciskoblicz.putExtra("pozostalylakier",pozostalyLakier);
        przyciskoblicz.putExtra("pozostalestylizacje",pozostaleStylizacje);
        startActivityForResult(przyciskoblicz,1);}
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        TextView wyswietlaniewynikow01 = (TextView) findViewById(R.id.wyswietleniewynikow1);
        TextView wyswietlaniewynikow02 = (TextView) findViewById(R.id.wyswietleniewynikow2);
        if(requestCode == 1){
            if(resultCode == RESULT_OK){
                wyswietlaniewynikow01.setText(data.getStringExtra("nailpolishValue"));
                wyswietlaniewynikow02.setText(data.getStringExtra("personValue"));
            }
        }
    }
}
