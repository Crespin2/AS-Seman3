package com.jamc.app_s3;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RadioGroup_y_RadioButton extends AppCompatActivity{
    private EditText etv1, etv2;
    private RadioButton opS,opR;
    private TextView result;
    private MenuItem ej1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radiogroup_radiobutton);
        etv1=(EditText) findViewById(R.id.etn1);
        etv2=(EditText) findViewById(R.id.etn2);
        opS=(RadioButton) findViewById(R.id.rb1);
        opR=(RadioButton) findViewById(R.id.rb2);
        result=(TextView) findViewById(R.id.resultado);


    }

    //ESTE METODO SE EJECUTARA CUANDO SE PRESIONE EL BOTON "OPERAR"
    public void operar(View view){
        //Hacer la conversión de valores
        String valor1=etv1.getText().toString();
        String valor2=etv2.getText().toString();
        Double n1=Double.parseDouble(valor1);
        Double n2=Double.parseDouble(valor2);

        String resu="";
        //Condición para cuando se selecionan los radiobutton
        if (opS.isChecked()==true) {
            Double suma=n1+n2;
            resu=String.valueOf(suma);
            result.setText(resu);
        }else if (opR.isChecked()==true){
            Double resta=n1-n2;
            resu=String.valueOf(resta);
            result.setText(resu);
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
            Intent i = new Intent(RadioGroup_y_RadioButton.this, MainActivity.class);
            startActivity(i);
        }else if (id == R.id.ejercicio2)
        {
            Toast.makeText(this, "Ejercicio - 2", Toast.LENGTH_SHORT).show();
        }else if (id == R.id.ejercicio3){
            Toast.makeText(this, "Ejercicio - 3", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(RadioGroup_y_RadioButton.this, UsoDeCheckBox.class);
            startActivity(i);
        }else if (id == R.id.ejercicio4){
            Toast.makeText(this, "Ejercicio - 4", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(RadioGroup_y_RadioButton.this, ControlSpinner.class);
            startActivity(i);
        }else if (id == R.id.ejercicio5) {
            Toast.makeText(this, "Ejercicio - 5", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(RadioGroup_y_RadioButton.this, Control_LIstView.class);
            startActivity(i);
        }else if (id == R.id.ejercicio6) {
            Toast.makeText(this, "Ejercicio - 6", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(RadioGroup_y_RadioButton.this, Control_IMG_Button.class);
            startActivity(i);
        }else if (id == R.id.ejercicio7) {
            Toast.makeText(this, "Ejercicio - 7", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(RadioGroup_y_RadioButton.this, Notificaciones_Toast.class);
            startActivity(i);
        }else if (id == R.id.ejercicio8) {
            Toast.makeText(this, "Ejercicio - 8", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(RadioGroup_y_RadioButton.this, Control_EditText.class);
            startActivity(i);
        }else if (id == R.id.ejercicio9) {
            Toast.makeText(this, "Ejercicio - 9", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(RadioGroup_y_RadioButton.this, Lanzar_un_2do_Activity.class);
            startActivity(i);
        }else if (id == R.id.ejercicio10) {
            Toast.makeText(this, "Ejercicio - 10", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(RadioGroup_y_RadioButton.this, Lanzar_con_Parametros.class);
            startActivity(i);
        }else if (id == R.id.ejercicio11_1) {
            Toast.makeText(this, "Ejercicio - 11 - 1", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(RadioGroup_y_RadioButton.this, Almacenamiento_SharedPreferences.class);
            startActivity(i);
        }else if (id == R.id.ejercicio11_2) {
            Toast.makeText(this, "Ejercicio - 11 - 2", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(RadioGroup_y_RadioButton.this, SharedPreferences_P2.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

}
