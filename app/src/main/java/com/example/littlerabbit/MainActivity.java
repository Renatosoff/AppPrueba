package com.example.littlerabbit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        String correo = "admin@mail.com";
        String clave = "admin123";
        EditText edtCorreo;
        EditText edtPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getSupportActionBar()!=null){
            getSupportActionBar().hide();

        }

        edtCorreo = findViewById(R.id.editTextMail);
        edtPass = findViewById(R.id.editTextPassword);
    }

    public void goToHome(View view){

        if (correo.equals(edtCorreo.getText().toString()) && clave.equals(edtPass.getText().toString())){
            Intent activity = new Intent(this, HomePage.class);
            startActivity(activity);
            Toast.makeText(this, "Bienvenido Admin", Toast.LENGTH_SHORT).show();

        }
        else{
            Toast.makeText(this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show();
        }

    }
    public void goToCrearUser(View vista){
        Intent crearactivity = new Intent(this, Crear_User.class);
        startActivity(crearactivity);

    }

}