package com.jamc.app_s3;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class UsoDeCheckBox extends AppCompatActivity {
private EditText t1,t2;
private CheckBox op1, op2;
private TextView tvR1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkbox);

        t1=(EditText) findViewById(R.id.n1);
        t2=(EditText) findViewById(R.id.n2);
        op1=(CheckBox) findViewById(R.id.check1);
        op2=(CheckBox) findViewById(R.id.check2);
        tvR1=(TextView) findViewById(R.id.tvRes);

    }

    //METODO PARA LAS OPERACIONES
    public void operaciones(View view){
        String n1=t1.getText().toString();
        String n2=t2.getText().toString();
        Double valor1=Double.parseDouble(n1);
        Double valor2=Double.parseDouble(n2);

        String res="";
        //Condición para los checkbox
        if (op1.isChecked()==true){
            Double suma = valor1+valor2;
            res="La suma es: "+suma;
        }
        if(op2.isChecked()==true){
            Double resta = valor1-valor2;
            res=res+" ::: La resta es: "+resta;
        }
        tvR1.setText(res);
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
            Intent i = new Intent(UsoDeCheckBox.this, MainActivity.class);
            startActivity(i);
        }else if (id == R.id.ejercicio2)
        {
            Toast.makeText(this, "Ejercicio - 2", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(UsoDeCheckBox.this, RadioGroup_y_RadioButton.class);
            startActivity(i);
        }else if (id == R.id.ejercicio3){
            Toast.makeText(this, "Ejercicio - 3", Toast.LENGTH_SHORT).show();
        }else if (id == R.id.ejercicio4){
            Toast.makeText(this, "Ejercicio - 4", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(UsoDeCheckBox.this, ControlSpinner.class);
            startActivity(i);
        }else if (id == R.id.ejercicio5) {
            Toast.makeText(this, "Ejercicio - 5", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(UsoDeCheckBox.this, Control_LIstView.class);
            startActivity(i);
        }else if (id == R.id.ejercicio6) {
            Toast.makeText(this, "Ejercicio - 6", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(UsoDeCheckBox.this, Control_IMG_Button.class);
            startActivity(i);
        }else if (id == R.id.ejercicio7) {
            Toast.makeText(this, "Ejercicio - 7", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(UsoDeCheckBox.this, Notificaciones_Toast.class);
            startActivity(i);
        }else if (id == R.id.ejercicio8) {
            Toast.makeText(this, "Ejercicio - 8", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(UsoDeCheckBox.this, Control_EditText.class);
            startActivity(i);
        }else if (id == R.id.ejercicio9) {
            Toast.makeText(this, "Ejercicio - 9", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(UsoDeCheckBox.this, Lanzar_un_2do_Activity.class);
            startActivity(i);
        }else if (id == R.id.ejercicio10) {
            Toast.makeText(this, "Ejercicio - 10", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(UsoDeCheckBox.this, Lanzar_con_Parametros.class);
            startActivity(i);
        }else if (id == R.id.ejercicio11_1) {
            Toast.makeText(this, "Ejercicio - 11 - 1", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(UsoDeCheckBox.this, Almacenamiento_SharedPreferences.class);
            startActivity(i);
        }else if (id == R.id.ejercicio11_2) {
            Toast.makeText(this, "Ejercicio - 11 - 2", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(UsoDeCheckBox.this, SharedPreferences_P2.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}
