package com.example.comercialquince;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;


public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);


    }
    public void nuevo_usu(View view){
        Intent intent = new Intent(Login.this,N_usuario.class);
        startActivity(intent);
    }

    public void ir(View view) {
        Intent intent = new Intent(Login.this, N_usuario.class);
        startActivity(intent);
    }
}