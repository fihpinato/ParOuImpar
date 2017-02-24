package com.example.filipe.parouimpar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

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

    public void jogar(View v){
        Toast.makeText(this, "Ainda não implementado", Toast.LENGTH_LONG).show();
    }
}
