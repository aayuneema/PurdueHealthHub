package com.example.purduehealthhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Flu extends AppCompatActivity {
    private Button onCampusClinics;
    private Button proofOfVaccination;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flu);

        onCampusClinics = (Button) findViewById(R.id.onCampusClinics);
        onCampusClinics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOnCampusClinics();
            }
        });

        proofOfVaccination = (Button) findViewById(R.id.proofOfVaccination);
        proofOfVaccination .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProofOfVaccination();
            }
        });
    }

    public void openOnCampusClinics() {
        Intent intent = new Intent(this, OnCampusClinics.class);
        startActivity(intent);
    }

    public void openProofOfVaccination() {
        Intent intent = new Intent(this, ProofOfVaccination.class);
        startActivity(intent);
    }


}