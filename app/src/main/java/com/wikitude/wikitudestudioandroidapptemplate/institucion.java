package com.wikitude.wikitudestudioandroidapptemplate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class institucion extends AppCompatActivity implements View.OnClickListener{
    ImageButton btnregresar;
    Button btninicio , ayuda , ubicanos , institucion , camara;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.institucion);
        btnregresar = (ImageButton) findViewById(R.id.regresar);
        btnregresar.setOnClickListener(this);

        btninicio = (Button) findViewById(R.id.btn_inicio);
        btninicio.setOnClickListener(this);

        ayuda = (Button) findViewById(R.id.ayuda);
        ayuda.setOnClickListener(this);


        institucion = (Button) findViewById(R.id.inst);
        institucion.setOnClickListener(this);

        camara = (Button) findViewById(R.id.cam);
        camara.setOnClickListener(this);

        ubicanos = (Button) findViewById(R.id.map);
        ubicanos.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == btnregresar){
            Intent r = new Intent(this, MainActivity.class);
            startActivity(r);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }
        if(v == camara){
            Intent r = new Intent(this, SampleCamActivity.class);
            startActivity(r);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }

        if(v == institucion){
            Intent r = new Intent(this, institucion.class);
            startActivity(r);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }

        if(v == ubicanos){
            Intent r = new Intent(this, ubicanos.class);
            startActivity(r);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }

        if(v == btninicio){
            Intent r = new Intent(this, MainActivity.class);
            startActivity(r);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }

        if(v == ayuda){
            Intent ra = new Intent(this, Ayuda.class);
            startActivity(ra);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }
    }
}
