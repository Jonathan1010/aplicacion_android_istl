package com.wikitude.wikitudestudioandroidapptemplate;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ubicanos extends AppCompatActivity implements View.OnClickListener  {
    ImageButton btnregresar;
    Button twitter, facebook, instagram , menu , institucion , camara , ayuda;

    private String urlfacebook;
    private String urlinstagram;
    private String urltwitter;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ubicanos);
        btnregresar = (ImageButton) findViewById(R.id.atras);
        btnregresar.setOnClickListener(this);

        urltwitter ="https://twitter.com/Tecnologicoloja";

        twitter = (Button) findViewById(R.id.twitter);
        twitter.setOnClickListener(this);

        urlfacebook="https://www.facebook.com/TecnologicoLoja";
        facebook = (Button) findViewById(R.id.facebook);
        facebook.setOnClickListener(this);


        urlinstagram="https://www.instagram.com/tecnologicoloja/";
        instagram = (Button) findViewById(R.id.instagram);
        instagram.setOnClickListener(this);

        //
        menu = (Button) findViewById(R.id.btn_menu);
        menu.setOnClickListener(this);

        camara = (Button) findViewById(R.id.camara);
        camara.setOnClickListener(this);

        institucion = (Button) findViewById(R.id.btninstitucion);
        institucion.setOnClickListener(this);

        ayuda = (Button) findViewById(R.id.helpme);
        ayuda.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if(v == btnregresar){
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }

        if(v == menu){
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }

        if(v == camara){
            Intent i = new Intent(this, SampleCamActivity.class);
            startActivity(i);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }

        if(v == camara){
            Intent t = new Intent(this, Ayuda.class);
            startActivity(t);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }

        if(v == institucion){
            Intent i = new Intent(this,institucion.class);
            startActivity(i);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }

        if(v == facebook){
            Uri uri = Uri.parse(urlfacebook);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }

        if(v == instagram){
            Uri uri = Uri.parse(urlinstagram);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }

        if(v == twitter){
            Uri uri = Uri.parse(urltwitter);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }

    }
}
