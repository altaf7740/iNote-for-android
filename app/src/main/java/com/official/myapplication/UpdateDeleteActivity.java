package com.official.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import static com.official.myapplication.R.layout.*;

public class UpdateDeleteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_update_delete);
        getSupportActionBar().setTitle("Edit credential");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}