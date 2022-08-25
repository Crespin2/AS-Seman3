package com.jamc.app_s3;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ControlSpinner extends AppCompatActivity {
    private Spinner Sp1;
    private EditText num1, num2;
    private TextView r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_spinner);

        Sp1=(Spinner) findViewById(R.id.spinner);
        num1=(EditText) findViewById(R.id.v1);
        num2=(EditText) findViewById(R.id.v2);
        r=(TextView) findViewById(R.id.muestraR);

        //Lista de opciones del Spinner
        String []opciones={"sumar", "restar", "multiplicar", "dividir"};
        ArrayAdapter <String> adapter= new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, opciones);
        Sp1.setAdapter(adapter);

    }

    //Metodo para hacer las operaciones dependiendo de la opcion seleccionada
    public void operarSpinner(View view){
        String v1=num1.getText().toString();
        String v2=num2.getText().toString();
        Double n1=Double.parseDouble(v1);
        Double n2=Double.parseDouble(v2);

        String op=Sp1.getSelectedItem().toString();
        if (op.equals("sumar")){
            Double suma=n1+n2;
            String resu=String.valueOf(suma);
            r.setText(resu);
        }else if (op.equals("restar")){
            Double resta=n1-n2;
            String resu=String.valueOf(resta);
            r.setText(resu);
        }else if (op.equals("multiplicar")){
            Double multi=n1*n2;
            String resu=String.valueOf(multi);
            r.setText(resu);
        }else if (op.equals("dividir")) {
            Double divi = n1 / n2;
            String resu = String.valueOf(divi);
            r.setText(resu);
        }
    }
    //MENU
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_app_s3, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if (id == R.id.ejercicio1){
            Toast.makeText(this, "Inicio", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(ControlSpinner.this, MainActivity.class);
            startActivity(i);
        }else if (id == R.id.ejercicio2)
        {
            Toast.makeText(this, "Ejercicio - 2", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(ControlSpinner.this, RadioGroup_y_RadioButton.class);
            startActivity(i);
        }else if (id == R.id.ejercicio3){
            Toast.makeText(this, "Ejercicio - 3", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(ControlSpinner.this, UsoDeCheckBox.class);
            startActivity(i);
        }else if (id == R.id.ejercicio4){
            Toast.makeText(this, "Ejercicio - 4", Toast.LENGTH_SHORT).show();
        }else if (id == R.id.ejercicio5) {
            Toast.makeText(this, "Ejercicio - 5", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(ControlSpinner.this, Control_LIstView.class);
            startActivity(i);
        }else if (id == R.id.ejercicio6) {
            Toast.makeText(this, "Ejercicio - 6", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(ControlSpinner.this, Control_IMG_Button.class);
            startActivity(i);
        }else if (id == R.id.ejercicio7) {
            Toast.makeText(this, "Ejercicio - 7", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(ControlSpinner.this, Notificaciones_Toast.class);
            startActivity(i);
        }else if (id == R.id.ejercicio8) {
            Toast.makeText(this, "Ejercicio - 8", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(ControlSpinner.this, Control_EditText.class);
            startActivity(i);
        }else if (id == R.id.ejercicio9) {
            Toast.makeText(this, "Ejercicio - 9", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(ControlSpinner.this, Lanzar_un_2do_Activity.class);
            startActivity(i);
        }else if (id == R.id.ejercicio10) {
            Toast.makeText(this, "Ejercicio - 10", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(ControlSpinner.this, Lanzar_con_Parametros.class);
            startActivity(i);
        }else if (id == R.id.ejercicio11_1) {
            Toast.makeText(this, "Ejercicio - 11 - 1", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(ControlSpinner.this, Almacenamiento_SharedPreferences.class);
            startActivity(i);
        }else if (id == R.id.ejercicio11_2) {
            Toast.makeText(this, "Ejercicio - 11 - 2", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(ControlSpinner.this, SharedPreferences_P2.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}
