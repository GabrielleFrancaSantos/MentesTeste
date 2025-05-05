package com.example.mentesteste;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Logincc extends AppCompatActivity {

    Button bt_login;
    Button bt_cadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_form_logincc);
    }

    public void TelaLogar(View view){
        Intent in = new Intent(Logincc.this, FormLogin.class);
        startActivity(in);
    }

    public void TelaCadastro(View view){
        Intent in = new Intent(Logincc.this, FormCadastro.class);
        startActivity(in);
    }

    public void TelaLoad(View view){
        Intent in = new Intent(Logincc.this, LoadActivity.class);
        startActivity(in);
    }

}