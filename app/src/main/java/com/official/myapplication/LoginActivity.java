package com.official.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
        Button loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if user is valid redirect to dashboard else same page.
                Intent dashboardActivity = new Intent(getApplicationContext(),OtpActivity.class);
                startActivity(dashboardActivity);
            }
        });

        TextView dontHaveAccount = findViewById(R.id.dontHaveAccountTextView);
        dontHaveAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                redirect to signup page
                Intent signupActivity = new Intent(getApplicationContext(), SignupActivity.class);
                startActivity(signupActivity);
                finish();
            }
        });

        TextView forgotPassword = findViewById(R.id.forgotPasswordTv);
        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(LoginActivity.this, "password reset link sent on your mail ...", Toast.LENGTH_SHORT).show();
                Snackbar.make(v, "account activation link sent on your mail", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }

        });
    }
}