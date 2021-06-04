package com.official.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        getSupportActionBar().hide();
        Button signupBtn = findViewById(R.id.signupBtn);
        Intent loginActivity = new Intent(getApplicationContext(), LoginActivity.class);
        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignupActivity.this, "account activation link sent on your mail", Toast.LENGTH_SHORT).show();
                startActivity(loginActivity);
                finish();
            }
        });

        TextView alreadyHaveAccount = findViewById(R.id.alreadyHaveAccountTextView);
        alreadyHaveAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(loginActivity);
                finish();
            }
        });
    }
}