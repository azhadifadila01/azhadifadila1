package com.example.azhadi.crudsqliite;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends Activity {
    // 10-05-2020
    // 10117277
    // Azhadi Fadila
    // IF-8

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread thread = new Thread(){
            public void run(){
                try{
                    sleep(4000);
                } catch (InterruptedException e ){
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(SplashActivity.this,MainActivity.class));
                }
            }
        };
    thread.start();
    }
}
