package com.example.tfg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Subcripcion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscripcion);
    }

    public void tarjeta_credito(View view) {
        Intent i = new Intent(this, Tarjeta_credito.class);
        startActivity(i);
    }
}