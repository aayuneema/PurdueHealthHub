package com.example.purduehealthhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Questions extends AppCompatActivity {
    private Button yesSymptoms;
    private Button noSymptoms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        yesSymptoms = (Button) findViewById(R.id.yesSymptoms);
        yesSymptoms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCovidPositive();
            }
        });

        noSymptoms = (Button) findViewById(R.id.noSymptoms);
        noSymptoms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCovidUnsure();
            }
        });
    }

    public void openCovidPositive() {
        Intent intent = new Intent(this, CovidPositive.class);
        startActivity(intent);
    }

    public void openCovidUnsure() {
        Intent intent = new Intent(this, CovidUnsure.class);
        startActivity(intent);
    }
}