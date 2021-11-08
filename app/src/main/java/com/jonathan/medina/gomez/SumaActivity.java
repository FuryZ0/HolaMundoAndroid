package com.jonathan.medina.gomez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.textfield.TextInputEditText;

public class SumaActivity extends AppCompatActivity {

    private TextInputEditText editTextX;
    private TextInputEditText editTextY;
    private TextInputEditText editTextTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);
        editTextX = findViewById(R.id.editTextNumberX );
        editTextY = findViewById(R.id.editTextNumberY );
        editTextTotal = findViewById(R.id.editTextNumberTotal );
    }
}