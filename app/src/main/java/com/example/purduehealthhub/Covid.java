package com.example.purduehealthhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Covid extends AppCompatActivity {
    private Button questions;
    private Button resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid);

        questions = (Button) findViewById(R.id.questions);
        questions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuestions();
            }
        });

        resources = (Button) findViewById(R.id.resources);
        resources.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openResources();
            }
        });
    }

    public void openQuestions() {
        Intent intent = new Intent(this, Questions.class);
        startActivity(intent);
    }

    public void openResources() {
        Intent intent = new Intent(this, Resources.class);
        startActivity(intent);
    }
}