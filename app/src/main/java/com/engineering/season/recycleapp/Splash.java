package com.engineering.season.recycleapp;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import static java.lang.Thread.sleep;

public class Splash extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.splash);
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Intent i= new Intent(Splash.this,MainActivity.class);
        startActivity(i);
    }
}
