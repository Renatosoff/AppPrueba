package com.example.littlerabbit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Crear_User extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear__user);
    }

    public void goToMain(View vista) {
        Intent actmain = new Intent(this, MainActivity.class);
        startActivity(actmain);
    }
}