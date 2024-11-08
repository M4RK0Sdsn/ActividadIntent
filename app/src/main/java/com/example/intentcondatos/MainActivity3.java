package com.example.intentcondatos;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    private TextView texto1_3;
    private TextView texto2_3;
    private TextView texto3_3;
    private EditText introTexto1_3;
    private EditText introTexto2_3;
    private Button boton1_3;

    private String nombreUsuarioRegistrado;
    private String contraseñaRegistrada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        texto1_3 = findViewById(R.id.texto1_3);
        texto2_3 = findViewById(R.id.texto2_3);
        texto3_3 = findViewById(R.id.texto3_3);
        introTexto1_3 = findViewById(R.id.introTexto1_3);
        introTexto2_3 = findViewById(R.id.introTexto2_3);
        boton1_3 = findViewById(R.id.boton1_3);
        Intent miintent2 = getIntent();
        nombreUsuarioRegistrado = miintent2.getStringExtra("NOMBRE_USUARIO");
        contraseñaRegistrada = miintent2.getStringExtra("CONTRASEÑA_USUARIO");

        boton1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuarioIngresado = introTexto1_3.getText().toString();
                String contraseñaIngresada = introTexto2_3.getText().toString();

                if (usuarioIngresado.equals(nombreUsuarioRegistrado) && contraseñaIngresada.equals(contraseñaRegistrada)) {
                    Intent intentBienvenida = new Intent(MainActivity3.this, MainActivity4.class);
                    intentBienvenida.putExtra("NOMBRE_USUARIO", nombreUsuarioRegistrado);
                    intentBienvenida.putExtra("CONTRASEÑA_USUARIO", contraseñaRegistrada);
                    startActivity(intentBienvenida);
                } else {
                    Toast.makeText(MainActivity3.this, "El usuario o la contraseña no coinciden", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
