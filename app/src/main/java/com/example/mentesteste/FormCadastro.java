package com.example.mentesteste;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;
import android.widget.RadioGroup;

public class FormCadastro extends AppCompatActivity {
    Button btCriarConta;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_form_cadastro);

        btCriarConta = findViewById(R.id.bt_criar_conta);
        radioGroup = findViewById(R.id.radioGroup);

        btCriarConta.setOnClickListener(view -> {
            int selectedId = radioGroup.getCheckedRadioButtonId();

            Log.d("DEBUG", "ID selecionado: " + selectedId);

            if (selectedId == R.id.option1) {
                Log.d("DEBUG", "Redirecionando para FormVoluntario");
                startActivity(new Intent(FormCadastro.this, FormVoluntario.class));
            } else if (selectedId == R.id.option2) {
                Log.d("DEBUG", "Redirecionando para LoadActivity");
                startActivity(new Intent(FormCadastro.this, LoadActivity.class));
            } else {
                Log.d("DEBUG", "Nada selecionado");
            }
        });
    }
}