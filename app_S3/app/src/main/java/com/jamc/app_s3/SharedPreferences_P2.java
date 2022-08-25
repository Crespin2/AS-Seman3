package com.jamc.app_s3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SharedPreferences_P2 extends AppCompatActivity {
    private EditText et1, et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences_p2);
        et1=(EditText) findViewById(R.id.etPersona);
        et2=(EditText) findViewById(R.id.etDatos);
    }

    public void grabar(View v){
        String nombre=et1.getText().toString();
        String datos=et2.getText().toString();
        SharedPreferences preferencias = getSharedPreferences("agenda", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=preferencias.edit();
        editor.putString(nombre, datos);
        editor.commit();
        Toast.makeText(this, "Datos grabados correctamente", Toast.LENGTH_SHORT).show();
    }

    public void recupera(View v){

        String nombre=et1.getText().toString();
        SharedPreferences prefe = getSharedPreferences("agenda", Context.MODE_PRIVATE);
        String d=prefe.getString(nombre, "");
        if (d.length()==0){
            Toast.makeText(this, "No existe dicho nombre en la agenda", Toast.LENGTH_SHORT).show();
        }else {
            et2.setText(d);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_app_s3, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if (id == R.id.ejercicio1){
            Toast.makeText(this, "Inicio", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(SharedPreferences_P2.this, MainActivity.class);
            startActivity(i);
        }else if (id == R.id.ejercicio2)
        {
            Toast.makeText(this, "Ejercicio - 2", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(SharedPreferences_P2.this, RadioGroup_y_RadioButton.class);
            startActivity(i);
        }else if (id == R.id.ejercicio3){
            Toast.makeText(this, "Ejercicio - 3", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(SharedPreferences_P2.this, UsoDeCheckBox.class);
            startActivity(i);
        }else if (id == R.id.ejercicio4){
            Toast.makeText(this, "Ejercicio - 4", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(SharedPreferences_P2.this, ControlSpinner.class);
            startActivity(i);
        }else if (id == R.id.ejercicio5) {
            Toast.makeText(this, "Ejercicio - 5", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(SharedPreferences_P2.this, Control_LIstView.class);
            startActivity(i);
        }else if (id == R.id.ejercicio6) {
            Toast.makeText(this, "Ejercicio - 6", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(SharedPreferences_P2.this, Control_IMG_Button.class);
            startActivity(i);
        }else if (id == R.id.ejercicio7) {
            Toast.makeText(this, "Ejercicio - 7", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(SharedPreferences_P2.this, Notificaciones_Toast.class);
            startActivity(i);
        }else if (id == R.id.ejercicio8) {
            Toast.makeText(this, "Ejercicio - 8", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(SharedPreferences_P2.this, Control_EditText.class);
            startActivity(i);
        }else if (id == R.id.ejercicio9) {
            Toast.makeText(this, "Ejercicio - 9", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(SharedPreferences_P2.this, Lanzar_un_2do_Activity.class);
            startActivity(i);
        }else if (id == R.id.ejercicio10) {
            Toast.makeText(this, "Ejercicio - 10", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(SharedPreferences_P2.this, Lanzar_con_Parametros.class);
            startActivity(i);
        }else if (id == R.id.ejercicio11_1) {
            Toast.makeText(this, "Ejercicio - 11 - 1", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(SharedPreferences_P2.this, Almacenamiento_SharedPreferences.class);
            startActivity(i);
        }else if (id == R.id.ejercicio11_2) {
            Toast.makeText(this, "Ejercicio - 11 - 2", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}