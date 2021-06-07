package com.official.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AddCredentialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_credential);
        getSupportActionBar().hide();
    }
}