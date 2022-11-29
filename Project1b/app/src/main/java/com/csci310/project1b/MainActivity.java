package com.csci310.project1b;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    SoundPool sp;
    int soundc, soundd, sounde, soundf, soundg, sounda, soundb, soundcnum, sounddnum, soundfnum, soundgnum, soundanum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = new SoundPool(12, AudioManager.STREAM_MUSIC,0);
        soundc = sp.load(this,R.raw.c,1);
        soundd = sp.load(this,R.raw.d,1);
        sounde = sp.load(this,R.raw.e,1);
        soundf = sp.load(this,R.raw.f,1);
        soundg = sp.load(this,R.raw.g,1);
        sounda = sp.load(this,R.raw.a,1);
        soundb = sp.load(this,R.raw.b,1);
        soundcnum = sp.load(this,R.raw.cnum,1);
        sounddnum = sp.load(this,R.raw.dnum,1);
        soundfnum = sp.load(this,R.raw.fnum,1);
        soundgnum = sp.load(this,R.raw.gnum,1);
        soundanum = sp.load(this,R.raw.anum,1);
    }

    public void onClikPlaySound(View view) {
        switch(view.getId()){
            case R.id.buttonC:
                sp.play(soundc,1,1,0,0,1);
                break;
            case R.id.buttonD:
                sp.play(soundd,1,1,0,0,1);
                break;
            case R.id.buttonE:
                sp.play(sounde,1,1,0,0,1);
                break;
            case R.id.buttonF:
                sp.play(soundf,1,1,0,0,1);
                break;
            case R.id.buttonG:
                sp.play(soundg,1,1,0,0,1);
                break;
            case R.id.buttonA:
                sp.play(sounda,1,1,0,0,1);
                break;
            case R.id.buttonB:
                sp.play(soundb,1,1,0,0,1);
                break;
            case R.id.buttonCNum:
                sp.play(soundcnum,1,1,0,0,1);
                break;
            case R.id.buttonDNum:
                sp.play(sounddnum,1,1,0,0,1);
                break;
            case R.id.buttonFNum:
                sp.play(soundfnum,1,1,0,0,1);
                break;
            case R.id.buttonGNum:
                sp.play(soundgnum,1,1,0,0,1);
                break;
            case R.id.buttonANum:
                sp.play(soundanum,1,1,0,0,1);
                break;
        }
    }
}