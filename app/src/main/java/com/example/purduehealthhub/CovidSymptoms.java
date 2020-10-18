package com.example.purduehealthhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CovidSymptoms extends AppCompatActivity {

    private Button yesButton3;
    private Button noButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid_symptoms);

        yesButton3 = (Button) findViewById(R.id.yesButton3);
        yesButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openYesCovidSymptoms();
            }
        });

        noButton3 = (Button) findViewById(R.id.noButton3);
        noButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNoCovidSymptoms();
            }
        });
    }

    public void openYesCovidSymptoms() {
        Intent intent = new Intent(this, YesCovidSymptoms.class);
        startActivity(intent);
    }

    public void openNoCovidSymptoms() {
        Intent intent = new Intent(this, NoCovidSymptoms.class);
        startActivity(intent);
    }
}