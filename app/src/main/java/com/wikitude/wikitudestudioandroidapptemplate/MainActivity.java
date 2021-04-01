package com.wikitude.wikitudestudioandroidapptemplate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button realidad_aumentada , ayuda ,institucion , ubicanos , menu;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTheme(R.style.Theme_AppCompat);
        realidad_aumentada = (Button) findViewById(R.id.realidad_aumentada);
        realidad_aumentada.setOnClickListener(this);

        institucion =(Button) findViewById(R.id.institucion);
        institucion.setOnClickListener(this);

        ayuda = (Button) findViewById(R.id.btn_ayuda);
        ayuda.setOnClickListener(this);

        ubicanos = (Button) findViewById(R.id.mapa);
        ubicanos.setOnClickListener(this);

        menu = (Button) findViewById(R.id.btn_inicio);
        menu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==ayuda){
            Intent i = new Intent(this, Ayuda.class);
            startActivity(i);
            Toast.makeText(this,"Ayuda",Toast.LENGTH_LONG).show();
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);

        }
        if(v==realidad_aumentada){
            Intent i = new Intent(this, SampleCamActivity.class);
            startActivity(i);
            Toast.makeText(this,"Wikitude",Toast.LENGTH_LONG).show();
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }
        if(v==realidad_aumentada){
            Intent op = new Intent(this, MainActivity.class);
            startActivity(op);
            Toast.makeText(this,"Inicio",Toast.LENGTH_LONG).show();
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }
        if(v==institucion){
            Intent i = new Intent(this, institucion.class);
            startActivity(i);
            Toast.makeText(this,"Institucion",Toast.LENGTH_LONG).show();
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }
        if(v==ubicanos){
            Intent i = new Intent(this, ubicanos.class);
            startActivity(i);
            Toast.makeText(this,"Ubicacion",Toast.LENGTH_LONG).show();
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }
    }
}