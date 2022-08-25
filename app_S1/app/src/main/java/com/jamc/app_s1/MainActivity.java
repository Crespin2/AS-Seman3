package com.jamc.app_s1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnRestar, btnSumar, btnMulti, btnDividir;
    EditText etv2, etv3;
    TextView tvres;
    operaciones instancia = new operaciones();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etv2=findViewById(R.id.etv2);
        etv3=findViewById(R.id.etv3);
        btnSumar=findViewById(R.id.btnSumar);
        btnRestar=findViewById(R.id.btnRestar);
        btnMulti=findViewById(R.id.btnMulti);
        btnDividir=findViewById(R.id.btnDividir);
        tvres=findViewById(R.id.tvres);

        Toast.makeText(this, "Bienvenidos a Android", Toast.LENGTH_SHORT).show();

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dato1 = etv2.getText().toString();
                String dato2 = etv3.getText().toString();

                if(dato1.length()==0){
                    etv2.setError("Campo Obligatorio");
                }else if (dato2.length()==0){
                    etv3.setError("Campo Obligatorio");
                }else{
                    double res= instancia.Sumar(Double.parseDouble(dato1), Double.parseDouble(dato2));
                    tvres.setText(String.valueOf(res));
                }
            }
        });

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dato1 = etv2.getText().toString();
                String dato2 = etv3.getText().toString();

                if(dato1.length()==0){
                    etv2.setError("Campo Obligatorio");
                }else if (dato2.length()==0){
                    etv3.setError("Campo Obligatorio");
                }else{
                    double res= instancia.Restar(Double.parseDouble(dato1), Double.parseDouble(dato2));
                    tvres.setText(String.valueOf(res));
                }

            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dato1 = etv2.getText().toString();
                String dato2 = etv3.getText().toString();

                if(dato1.length()==0){
                    etv2.setError("Campo Obligatorio");
                }else if (dato2.length()==0){
                    etv3.setError("Campo Obligatorio");
                }else{
                    double res= instancia.Multiplicar(Double.parseDouble(dato1), Double.parseDouble(dato2));
                    tvres.setText(String.valueOf(res));
                }

            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dato1 = etv2.getText().toString();
                String dato2 = etv3.getText().toString();

                if(dato1.length()==0){
                    etv2.setError("Campo Obligatorio");
                }else if (dato2.length()==0){
                    etv3.setError("Campo Obligatorio");
                }else{
                    double res= instancia.Dividir(Double.parseDouble(dato1), Double.parseDouble(dato2));
                    tvres.setText(String.valueOf(res));
                }

            }
        });
    }

}