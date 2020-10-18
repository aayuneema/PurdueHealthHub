package com.example.purduehealthhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Caps extends AppCompatActivity {
    private Button hotlineCrisis;
    private Button selfHelp;
    private Button inpersonTherapy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caps);


        hotlineCrisis = (Button) findViewById(R.id.hotlineCrisis);
        hotlineCrisis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEmergency();
            }
        });

        selfHelp = (Button) findViewById(R.id.selfHelp);
        selfHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSelfHelp();
            }
        });

        inpersonTherapy = (Button) findViewById(R.id.inpersonTherapy);
        inpersonTherapy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInPersonTherapy();
            }
        });
    }

    public void openEmergency() {
        Intent intent = new Intent(this, Emergency.class);
        startActivity(intent);
    }

    public void openSelfHelp() {
        Intent intent = new Intent(this, SelfHelp.class);
        startActivity(intent);
    }

    public void openInPersonTherapy() {
        Intent intent = new Intent(this, InPersonTherapy.class);
        startActivity(intent);
    }

}
