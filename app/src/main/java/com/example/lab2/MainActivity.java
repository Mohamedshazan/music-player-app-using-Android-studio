package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void musicPlay(View view) {
        mediaplayer = mediaplayer.create(this, R.raw.song1);
        mediaplayer.start();
        if (mediaplayer == null) ;
    }

    public void musicPause(View view) {
        mediaplayer.pause();
    }

    public void musicStop(View view) {
        mediaplayer.stop();
        mediaplayer=null;
    }



}