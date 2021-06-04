package com.official.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        Button getStartBtn = findViewById(R.id.getStartedBtn);
        getStartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                check if user is login or not
//                if login then redirect to dashboard else login page
                Intent loginActivity = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(loginActivity);
                finish();
            }
        });
    }
}