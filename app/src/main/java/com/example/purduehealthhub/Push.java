package com.example.purduehealthhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Push extends AppCompatActivity {

    private Button flu;
    private Button covid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_push);

        flu = (Button) findViewById(R.id.flu);
        flu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFlu();
            }
        });

        covid = (Button) findViewById(R.id.covid);
        covid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCovid();
            }
        });
    }

    public void openFlu() {
        Intent intent = new Intent(this, Flu.class);
        startActivity(intent);
    }

    public void openCovid() {
        Intent intent = new Intent(this, Covid.class);
        startActivity(intent);
    }
}