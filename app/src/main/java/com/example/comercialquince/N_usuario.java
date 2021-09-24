package com.example.comercialquince;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class N_usuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nusuario);
    }
    public void ir(View view) {
        Intent intent = new Intent(N_usuario.this, Vista1.class);
        startActivity(intent);
    }
}