package com.example.filipe.parouimpar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JogoActivity extends AppCompatActivity {

    private TextView tvNomeJogador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo);
        tvNomeJogador = (TextView) findViewById(R.id.tvNomeJogador);

        if(getIntent() != null){

            tvNomeJogador.setText(getIntent().getStringExtra("nome"));

        }
    }
}
