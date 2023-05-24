package com.example.exa_3er_hernandez_ap;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video extends AppCompatActivity implements View.OnClickListener{
    public VideoView videoPrueba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        videoPrueba = (VideoView)findViewById(R.id.vvVideoRH);

        //Para reproducir video
        Uri path = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video); //recursos externos
        MediaController mc = new MediaController(this);//instancia para controles de video y reproduccion
        videoPrueba.setMediaController(mc);//Coloca los botones de reprocur, pausa y detener
        videoPrueba.setVideoURI(path);//llamado del URI es para identificar el cursos video a reproducir
        videoPrueba.setMediaController(new MediaController(this));//Integra los controles y el recurso URI
        videoPrueba.start(); //ejecucion
    }


    @Override
    public void onClick(View view) {

    }
}