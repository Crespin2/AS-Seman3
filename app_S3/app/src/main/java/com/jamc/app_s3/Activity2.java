package com.jamc.app_s3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    private WebView webv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        webv=(WebView) findViewById(R.id.wv);
        Bundle bundle = getIntent().getExtras();
        String dato=bundle.getString("Direccion");
        webv.loadUrl("http://"+ dato);
        webv.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView v, String url){
                return false;
            }
        });
    }

    public void finalizar (View v){
        Intent i = new Intent(this, Lanzar_con_Parametros.class);
        startActivity(i);
    }


}