package com.example.purduehealthhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private EditText keywordText;
    private Button keywordButton;
    private Button careButton;
    private Button capsButton;
    private Button pushButton;
    public Button emergencyButton;
    private String userInput;
    private static final String TAG = "MyActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        keywordText = (EditText) findViewById(R.id.Keyword);
        keywordButton = (Button) findViewById(R.id.SendKeyword);
        keywordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                KeywordChecker checker = new KeywordChecker();
                userInput = keywordText.getText().toString();
                String location = checker.findKeyword(userInput.toLowerCase());
                if (location.equals("care")) {
                    openCare();
                }
                else if (location.equals("caps")) {
                    openCaps();
                }
                else if (location.equals("push")) {
                    openPush();
                }
                else if (location.equals("error")) {
                    Toast.makeText(MainActivity.this, "Keyword not found", Toast.LENGTH_SHORT).show();
                }
            }
        });

        careButton = (Button) findViewById(R.id.careButton);
        careButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCare();
            }
        });

        capsButton = (Button) findViewById(R.id.capsButton);
        capsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCaps();
            }
        });

        pushButton = (Button) findViewById(R.id.pushButton);
        pushButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPush();
            }
        });

        emergencyButton = (Button) findViewById(R.id.emergencyButton);
        emergencyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEmergency();
            }
        });

    }
    public void openCare() {
        Intent intent = new Intent(this, Care.class);
        startActivity(intent);
    }

    public void openCaps() {
        Intent intent = new Intent(this, Caps.class);
        startActivity(intent);
    }

    public void openPush() {
        Intent intent = new Intent(this, Push.class);
        startActivity(intent);
    }

    public void openEmergency() {
        Intent intent = new Intent(this, Emergency.class);
        startActivity(intent);
    }
}