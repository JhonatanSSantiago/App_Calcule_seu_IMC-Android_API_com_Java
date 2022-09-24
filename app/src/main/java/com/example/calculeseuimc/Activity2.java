package com.example.calculeseuimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    private TextView resultado;
    private TextView viewNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        resultado = findViewById(R.id.txtViewResultado);
        viewNome = findViewById(R.id.txtViewNome);

        Intent i = getIntent();
        String dados = i.getStringExtra("dados");
        String imc = i.getStringExtra("imc");
        String nome = i.getStringExtra("nome");
        viewNome.setText(nome +", Seu IMC é: "+ imc);
        resultado.setText(dados);
    }
}