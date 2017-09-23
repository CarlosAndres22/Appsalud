package com.example.user.nuevaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class RegistrationActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);

        Button GuardarDatos;

        GuardarDatos = (Button)findViewById(R.id.Enviar);

        GuardarDatos.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v){

                EditText InputNombre,InputApellido,InputEmail,InputTelefono, InputDireccion;
                String nombre,apellido, email,telefono, msjGen = "" ,direccion;
                int genero;
                RadioGroup InputGenero;


                InputGenero = (RadioGroup)findViewById(R.id.RadioOptions);
                System.out.println(InputGenero);
                genero = InputGenero.getCheckedRadioButtonId();
                switch (genero){
                    case R.id.radio1: msjGen="Femenino";
                        break;
                    case R.id.radio2: msjGen="Masculino";
                        break;
                }



                InputNombre = (EditText)findViewById(R.id.CampoNombre);
                nombre = InputNombre.getText().toString();

                InputApellido = (EditText)findViewById(R.id.CampoApellido);
                apellido = InputApellido.getText().toString();

                InputEmail = (EditText)findViewById(R.id.CampoEmail);
                email = InputEmail.getText().toString();



                InputTelefono = (EditText)findViewById(R.id.CampoTelefono);
                telefono = InputTelefono.getText().toString();

                InputDireccion = (EditText)findViewById(R.id.CampoDireccion);
                direccion = InputDireccion.getText().toString();

                Intent guardarDatos = new Intent(RegistrationActivity.this,  ConfirmationActivity.class);
                guardarDatos.putExtra("nombre", nombre);
                guardarDatos.putExtra("apellido", apellido);
                guardarDatos.putExtra("email", email);
                guardarDatos.putExtra("genero", msjGen);
                guardarDatos.putExtra("telefono", telefono);
                guardarDatos.putExtra("direccion", direccion);
                startActivity(guardarDatos);
            }
        });
    }
}
