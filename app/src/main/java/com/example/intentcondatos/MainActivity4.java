package com.example.intentcondatos;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    private TextView textViewBienvenida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4); // Layout personalizado para la bienvenida

        // Referencia al TextView para mostrar la bienvenida
        textViewBienvenida = findViewById(R.id.textViewBienvenida);

        // Obtener los datos del Intent
        Intent intent = getIntent();
        String nombreUsuario = intent.getStringExtra("NOMBRE_USUARIO");
        String contraseñaUsuario = intent.getStringExtra("CONTRASEÑA_USUARIO");

        // Mensaje de bienvenida personalizado
        String mensaje = "Bienvenido, " + nombreUsuario + "!\n\nTu contraseña es: " + contraseñaUsuario;
        textViewBienvenida.setText(mensaje);
    }
}
