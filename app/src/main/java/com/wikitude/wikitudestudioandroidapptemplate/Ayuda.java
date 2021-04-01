package com.wikitude.wikitudestudioandroidapptemplate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Ayuda extends AppCompatActivity implements View.OnClickListener {
    ImageButton  btnregresar;
    Button menu, institucion , ayuda, camara , ubicacion;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayuda);
        btnregresar = (ImageButton) findViewById(R.id.regresar);
        btnregresar.setOnClickListener(this);

        menu = (Button) findViewById(R.id.btn_inicio);
        menu.setOnClickListener(this);

        institucion = (Button) findViewById(R.id.btn_inicio);
        institucion.setOnClickListener(this);

        ayuda = (Button) findViewById(R.id.help);
        ayuda.setOnClickListener(this);

        camara = (Button) findViewById(R.id.wikitude);
        camara.setOnClickListener(this);

        ubicacion = (Button) findViewById(R.id.google);
        ubicacion.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == btnregresar){
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }

        if(v == menu){
            Intent m = new Intent(this, MainActivity.class);
            startActivity(m);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }

        if(v == institucion){
            Intent m = new Intent(this, institucion.class);
            startActivity(m);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }

        if(v == ayuda){
            Intent m = new Intent(this, Ayuda.class);
            startActivity(m);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }

        if(v == camara){
            Intent m = new Intent(this, SampleCamActivity.class);
            startActivity(m);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }

        if(v == ubicacion){
            Intent m = new Intent(this, ubicanos.class);
            startActivity(m);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }

    }
}