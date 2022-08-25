package com.jamc.app_s3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

//Agregar implements View.OnClickListener
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //Instancia de la clase Operaciones
    Operaciones op = new Operaciones();
    //Crear las variables
    private Button b1,b2,b3,b4;
    private EditText numero1,numero2;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Darle valor a las variables con los nombres de los identificadores(id) del la Vista(View)
        b1 = findViewById(R.id.btnSumar);
        b2 = findViewById(R.id.btnRestar);
        b3 = findViewById(R.id.btnMultiplicar);
        b4 = findViewById(R.id.btnDividir);
        numero1 = findViewById(R.id.et1);
        numero2 = findViewById(R.id.et2);
        result = findViewById(R.id.res);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);

    }
//Metodo OnClick donde va lo que hará cada boton al hacerle CLick
    @Override
    public void onClick(View view) {
        //Variables para convertir de Double a Texto para guardar lo del EditText
    String n1 = numero1.getText().toString();
    String n2 = numero2.getText().toString();
    Double res;
        switch (view.getId()){
            case R.id.btnSumar:
                //Covertimos las variables a Double
                res=op.Sumar(Double.parseDouble(n1), Double.parseDouble(n2));
                //Covertimos a String para devolver el resultado al TextView
                result.setText(String.valueOf(res));
                break;
            case R.id.btnRestar:
                res=op.Restar(Double.parseDouble(n1), Double.parseDouble(n2));
                result.setText(String.valueOf(res));
                break;
            case R.id.btnMultiplicar:
                res=op.Multiplicar(Double.parseDouble(n1), Double.parseDouble(n2));
                result.setText(String.valueOf(res));
                break;
            case R.id.btnDividir:
                res=op.Dividir(Double.parseDouble(n1), Double.parseDouble(n2));
                result.setText(String.valueOf(res));
                break;
            default:
                Toast.makeText(this, "Ha ocurrido un Error", Toast.LENGTH_SHORT).show();
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
        }else if (id == R.id.ejercicio2)
        {
            Toast.makeText(this, "Ejercicio - 2", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(MainActivity.this, RadioGroup_y_RadioButton.class);
            startActivity(i);
        }else if (id == R.id.ejercicio3){
            Toast.makeText(this, "Ejercicio - 3", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(MainActivity.this, UsoDeCheckBox.class);
            startActivity(i);
        }else if (id == R.id.ejercicio4){
            Toast.makeText(this, "Ejercicio - 4", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(MainActivity.this, ControlSpinner.class);
            startActivity(i);
        }else if (id == R.id.ejercicio5) {
            Toast.makeText(this, "Ejercicio - 5", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(MainActivity.this, Control_LIstView.class);
            startActivity(i);
        }else if (id == R.id.ejercicio6) {
            Toast.makeText(this, "Ejercicio - 6", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(MainActivity.this, Control_IMG_Button.class);
            startActivity(i);
        }else if (id == R.id.ejercicio7) {
            Toast.makeText(this, "Ejercicio - 7", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(MainActivity.this, Notificaciones_Toast.class);
            startActivity(i);
        }else if (id == R.id.ejercicio8) {
            Toast.makeText(this, "Ejercicio - 8", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(MainActivity.this, Control_EditText.class);
            startActivity(i);
        }else if (id == R.id.ejercicio9) {
            Toast.makeText(this, "Ejercicio - 9", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(MainActivity.this, Lanzar_un_2do_Activity.class);
            startActivity(i);
        }else if (id == R.id.ejercicio10) {
            Toast.makeText(this, "Ejercicio - 10", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(MainActivity.this, Lanzar_con_Parametros.class);
            startActivity(i);
        }else if (id == R.id.ejercicio11_1) {
            Toast.makeText(this, "Ejercicio - 11 - 1", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(MainActivity.this, Almacenamiento_SharedPreferences.class);
            startActivity(i);
        }else if (id == R.id.ejercicio11_2) {
            Toast.makeText(this, "Ejercicio - 11 - 2", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(MainActivity.this, SharedPreferences_P2.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}