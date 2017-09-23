package com.example.user.nuevaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmationActivity extends AppCompatActivity {

    Bundle data;
    String nombre,apellido,email,sexo, telefono, Direccion;
    TextView printNombre, printApellidos, PrintEmail, PrintGenero, PrintTelefono, PrintDireccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirmation);

        printNombre = (TextView)findViewById(R.id.DataNombre);
        printApellidos = (TextView)findViewById(R.id.DataApellido);
        PrintEmail = (TextView)findViewById(R.id.DataEmail);
        PrintGenero = (TextView)findViewById(R.id.DataGenero);
        PrintTelefono = (TextView)findViewById(R.id.DataEdad);
        PrintDireccion = (TextView)findViewById(R.id.DataAdicional);


        data = getIntent().getExtras();

        nombre = data.getString("nombre");
        apellido = data.getString("apellido");
        email = data.getString("email");
        sexo = data.getString("genero");
        telefono = data.getString("telefono");
        Direccion = data.getString("direccion");

        printNombre.setText(nombre);
        printApellidos.setText(apellido);
        PrintEmail.setText(email);
        PrintGenero.setText(sexo);
        PrintTelefono.setText(telefono);
        PrintDireccion.setText(Direccion);

        Button salir = (Button)findViewById(R.id.btnFinal);

        salir.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
    }

}
