package com.example.intentcondatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView texto1_2;
    private TextView texto2_2;
    private TextView texto3_2;
    private EditText introTexto1_2;
    private EditText introTexto2_2;
    private Button boton1_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Inicializamos los elementos de la vista
        texto1_2 = findViewById(R.id.texto1_2);
        texto2_2 = findViewById(R.id.texto2_2);
        texto3_2 = findViewById(R.id.texto3_2);
        introTexto1_2 = findViewById(R.id.introTexto1_2);
        introTexto2_2 = findViewById(R.id.introTexto2_2);
        boton1_2 = findViewById(R.id.boton1_2);

        boton1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = introTexto1_2.getText().toString();
                String contraseña = introTexto2_2.getText().toString();

                Intent miintent2 = new Intent(MainActivity2.this, MainActivity3.class);
                miintent2.putExtra("NOMBRE_USUARIO", usuario);
                miintent2.putExtra("CONTRASEÑA_USUARIO", contraseña);

                startActivity(miintent2);
            }
        });
    }
}
