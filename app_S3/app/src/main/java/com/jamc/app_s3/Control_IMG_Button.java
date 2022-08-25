package com.jamc.app_s3;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Control_IMG_Button extends AppCompatActivity {
    private TextView t1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_img_button);
        t1=(TextView) findViewById(R.id.tvimgb);
    }
    public void llamar(View view){
        t1.setText("Llamado...");
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
            Intent i = new Intent(Control_IMG_Button.this, MainActivity.class);
            startActivity(i);
        }else if (id == R.id.ejercicio2)
        {
            Toast.makeText(this, "Ejercicio - 2", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(Control_IMG_Button.this, RadioGroup_y_RadioButton.class);
            startActivity(i);
        }else if (id == R.id.ejercicio3){
            Toast.makeText(this, "Ejercicio - 3", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(Control_IMG_Button.this, UsoDeCheckBox.class);
            startActivity(i);
        }else if (id == R.id.ejercicio4){
            Toast.makeText(this, "Ejercicio - 4", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(Control_IMG_Button.this, ControlSpinner.class);
            startActivity(i);
        }else if (id == R.id.ejercicio5) {
            Toast.makeText(this, "Ejercicio - 5", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(Control_IMG_Button.this, Control_LIstView.class);
            startActivity(i);
        }else if (id == R.id.ejercicio6) {
            Toast.makeText(this, "Ejercicio - 6", Toast.LENGTH_SHORT).show();
        }else if (id == R.id.ejercicio8) {
            Toast.makeText(this, "Ejercicio - 8", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(Control_IMG_Button.this, Control_EditText.class);
            startActivity(i);
        }else if (id == R.id.ejercicio9) {
            Toast.makeText(this, "Ejercicio - 9", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(Control_IMG_Button.this, Lanzar_un_2do_Activity.class);
            startActivity(i);
        }else if (id == R.id.ejercicio10) {
            Toast.makeText(this, "Ejercicio - 10", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(Control_IMG_Button.this, Lanzar_con_Parametros.class);
            startActivity(i);
        }else if (id == R.id.ejercicio11_1) {
            Toast.makeText(this, "Ejercicio - 11 - 1", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(Control_IMG_Button.this, Almacenamiento_SharedPreferences.class);
            startActivity(i);
        }else if (id == R.id.ejercicio11_2) {
            Toast.makeText(this, "Ejercicio - 11 - 2", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(Control_IMG_Button.this, SharedPreferences_P2.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }
}
