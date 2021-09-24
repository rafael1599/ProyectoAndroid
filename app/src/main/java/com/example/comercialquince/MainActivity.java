package com.example.comercialquince;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;


public class MainActivity extends AppCompatActivity {


    private static int time =4000;
    //------

    View loeps;
    //Animacion

    Animation topAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        topAnimation = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        //---
        loeps = findViewById(R.id.logo_first);
        loeps.setAnimation(topAnimation);


        //-- login --//

        new Handler().postDelayed(new Runnable() {

            public void run() {
                Intent intent = new Intent( MainActivity.this,Login.class);
                startActivity(intent);
                finish();
            }
        },time);


    }
}

