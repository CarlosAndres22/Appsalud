package com.example.user.nuevaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    Button registrar, salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        registrar = (Button)findViewById(R.id.registrar);

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v){
                Intent siguiente = new Intent(LoginActivity.this,  RegistrationActivity.class);
                startActivity(siguiente);
            }
        });

        salir = (Button)findViewById(R.id.BtnSalir);

        salir.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v){
                finish();
                System.exit(0);
            }
        });
    }
}
