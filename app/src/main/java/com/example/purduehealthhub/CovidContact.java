package com.example.purduehealthhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CovidContact extends AppCompatActivity {
    private Button yesButton2;
    private Button noButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid_contact);

        yesButton2 = (Button) findViewById(R.id.yesButton2);
        yesButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCovidSymptoms();
            }
        });

        noButton2 = (Button) findViewById(R.id.noButton2);
        noButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNoCovidContact();
            }
        });
    }

    public void openCovidSymptoms() {
        Intent intent = new Intent(this, CovidSymptoms.class);
        startActivity(intent);
    }

    public void openNoCovidContact() {
        Intent intent = new Intent(this, NoCovidContact.class);
        startActivity(intent);
    }
}