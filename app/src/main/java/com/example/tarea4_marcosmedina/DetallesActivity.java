package com.example.tarea4_marcosmedina;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetallesActivity extends AppCompatActivity {
    String departamento,municipio;
    TextView txtDepto, txtMuni;
    Button btnAtras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);
        departamento = getIntent().getStringExtra("depto");
        municipio = getIntent().getStringExtra("municipio");
        getSupportActionBar().setTitle("Detalles");

        txtDepto = (TextView) findViewById(R.id.txtDepto);
        txtMuni= (TextView) findViewById(R.id.txtMuni);
        btnAtras = (Button) findViewById(R.id.btnRegresar);
        txtDepto.setText(departamento);
        txtMuni.setText(municipio);
    }

    public void atras(View v){
        finish();
    }
}