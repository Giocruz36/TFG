package com.example.tfg;

import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class Registro extends AppCompatActivity {
    private boolean esVisible;
    EditText cont1,cont2;
    ImageView v1,v2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        v1 = findViewById(R.id.ojo);
        v2 = findViewById(R.id.ojo1);
        cont1 = findViewById(R.id.contraseña_reg);
        cont2 = findViewById(R.id.confir_contraseña_reg);
        v1.setOnClickListener((View.OnClickListener) v -> {
            if(!esVisible) {
                cont1.setTransformationMethod(PasswordTransformationMethod.getInstance());
                v1.setImageResource(R.drawable.ojo);
                esVisible = true;
            }
            else {
                cont1.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                esVisible = false;
                v1.setImageResource(R.drawable.ojo_tachado);
            }
        });

        v2.setOnClickListener((View.OnClickListener) v -> {
            if(!esVisible) {
                cont2.setTransformationMethod(PasswordTransformationMethod.getInstance());
                v2.setImageResource(R.drawable.ojo);
                esVisible = true;
            }
            else {
                cont2.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                v2.setImageResource(R.drawable.ojo_tachado);
                esVisible = false;
            }
        });

    }



}
