package com.jamc.app_s3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class AcercaDe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acerca_de);

    }

    public void salir(View v) {

        Intent i = new Intent(this, Lanzar_un_2do_Activity.class);
        startActivity(i);
    }
}
