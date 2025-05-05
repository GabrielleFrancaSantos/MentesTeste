package com.example.mentesteste;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class FormLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_form_login);
    }

    public void TelaCadastro(View view){
        Intent in = new Intent(FormLogin.this, FormCadastro.class);
        startActivity(in);
    }

    public void TelaLoad(View view) {
        Intent in = new Intent(FormLogin.this, LoadActivity.class);
        startActivity(in);

    }
}