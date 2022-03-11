package com.example.tfg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private boolean esVisible;
    EditText password;
    ImageView visible;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        visible=findViewById(R.id.ojo3);
        password = findViewById(R.id.contraseña);
        visible.setOnClickListener((View.OnClickListener) v -> {
            if(!esVisible) {
                password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                visible.setImageResource(R.drawable.ojo);
                esVisible = true;
            }
            else {
                password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                esVisible = false;
                visible.setImageResource(R.drawable.ojo_tachado);
            }
        });

    }

    public void creacuenta(View view) {
        Intent i = new Intent(this, Registro.class);
        startActivity(i);
    }
}