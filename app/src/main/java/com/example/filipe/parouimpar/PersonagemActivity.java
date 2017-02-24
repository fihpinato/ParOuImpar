package com.example.filipe.parouimpar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class PersonagemActivity extends AppCompatActivity {

    // Declarar variaveis/objetos
    private EditText etNome;
    private Spinner spClasses;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personagem);

        //Instanciar Objetos
        etNome = (EditText) findViewById(R.id.etNome);
        spClasses = (Spinner) findViewById(R.id.spClasses);
    }

    public void jogar(View v){
        Intent telaJogo = new Intent(this, JogoActivity.class);
        telaJogo.putExtra("nome", etNome.getText().toString());
        telaJogo.putExtra("classe", spClasses.getSelectedItem().toString());
        startActivity(telaJogo);
    }
}
