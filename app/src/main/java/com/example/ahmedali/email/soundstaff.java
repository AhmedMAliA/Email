package com.example.ahmedali.email;

import android.app.Activity;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Ahmed Ali on 11/27/2015.
 */
public class soundstaff extends Activity{


    MediaPlayer mp;

    SoundPool sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View v=new View(this);
        v.setBackgroundColor(Color.BLACK);
        setContentView(v);

        mp=MediaPlayer.create(this,R.raw.mmm);
        sp=new SoundPool(7, AudioManager.STREAM_MUSIC,0);

       final int exp= sp.load(this,R.raw.exp,0);


        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sp.play(exp,1,1,0,0,1);
            }
        });

        v.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                mp.start();
                return false;
            }
        });

    }
}
