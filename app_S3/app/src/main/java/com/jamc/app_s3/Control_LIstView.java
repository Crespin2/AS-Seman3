package com.jamc.app_s3;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Control_LIstView extends AppCompatActivity {
    private String[] paises={"Chile", "Costa Rica", "Argentina", "Venezuela", "Brazil", "Nicaragua", "Colombia", "Honduras", "Guatemala", "El Salvador"};
    private String[] habitantes={"14000000", "43000000", "4000000","15000000","2400000","230000","2340000","4000000","1300000","1400000"};
    private TextView tv;
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_listview);
        tv=(TextView) findViewById(R.id.tvR);
        lv=(ListView) findViewById(R.id.lv);

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, paises );
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            //position,id
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                    tv.setText("Población de "+ lv.getItemAtPosition(position) + " es "+ habitantes[position]);
            }
        });
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
            Intent i = new Intent(Control_LIstView.this, MainActivity.class);
            startActivity(i);
        }else if (id == R.id.ejercicio2)
        {
            Toast.makeText(this, "Ejercicio - 2", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(Control_LIstView.this, RadioGroup_y_RadioButton.class);
            startActivity(i);
        }else if (id == R.id.ejercicio3){
            Toast.makeText(this, "Ejercicio - 3", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(Control_LIstView.this, UsoDeCheckBox.class);
            startActivity(i);
        }else if (id == R.id.ejercicio4){
            Toast.makeText(this, "Ejercicio - 4", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(Control_LIstView.this, ControlSpinner.class);
            startActivity(i);
        }else if (id == R.id.ejercicio5) {
            Toast.makeText(this, "Ejercicio - 5", Toast.LENGTH_SHORT).show();
        }else if (id == R.id.ejercicio6) {
            Toast.makeText(this, "Ejercicio - 6", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(Control_LIstView.this, Control_IMG_Button.class);
            startActivity(i);
        }else if (id == R.id.ejercicio7) {
            Toast.makeText(this, "Ejercicio - 7", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(Control_LIstView.this, Notificaciones_Toast.class);
            startActivity(i);
        }else if (id == R.id.ejercicio8) {
            Toast.makeText(this, "Ejercicio - 8", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(Control_LIstView.this, Control_EditText.class);
            startActivity(i);
        }else if (id == R.id.ejercicio9) {
            Toast.makeText(this, "Ejercicio - 9", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(Control_LIstView.this, Lanzar_un_2do_Activity.class);
            startActivity(i);
        }else if (id == R.id.ejercicio10) {
            Toast.makeText(this, "Ejercicio - 10", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(Control_LIstView.this, Lanzar_con_Parametros.class);
            startActivity(i);
        }else if (id == R.id.ejercicio11_1) {
            Toast.makeText(this, "Ejercicio - 11 - 1", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(Control_LIstView.this, Almacenamiento_SharedPreferences.class);
            startActivity(i);
        }else if (id == R.id.ejercicio11_2) {
            Toast.makeText(this, "Ejercicio - 11 - 2", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(Control_LIstView.this, SharedPreferences_P2.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}
