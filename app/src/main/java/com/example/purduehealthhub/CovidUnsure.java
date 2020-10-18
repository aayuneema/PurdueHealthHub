package com.example.purduehealthhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CovidUnsure extends AppCompatActivity {
    private Button yesButton1;
    private Button noButton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid_unsure);

        yesButton1 = (Button) findViewById(R.id.yesButton1);
        yesButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCovidContact();
            }
        });

        noButton1 = (Button) findViewById(R.id.noButton1);
        noButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCovidNegative();
            }
        });
    }

    public void openCovidContact() {
        Intent intent = new Intent(this, CovidContact.class);
        startActivity(intent);
    }

    public void openCovidNegative() {
        Intent intent = new Intent(this, CovidNegative.class);
        startActivity(intent);
    }
}