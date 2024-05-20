package com.example.tarea4_marcosmedina;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView txtUser,txtPass;
    Button btnIniciar, btnSalir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Marcos Medina");

        txtUser = (TextView) findViewById(R.id.txtUsuario);
        txtPass = (TextView) findViewById(R.id.txtPass);
    }

    public void login(View v) {
        String user = txtUser.getText().toString();
        String pass = txtPass.getText().toString();

        String[] usernames = getResources().getStringArray(R.array.usuarios);
        String[] passwords = getResources().getStringArray(R.array.claves);

        boolean isValid = false;
        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(user) && passwords[i].equals(pass)) {
                isValid = true;
                break;
            }
        }

        if (isValid) {
            Intent intent = new Intent(this, DepartamentosActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Credenciales incorrectas", Toast.LENGTH_LONG).show();
        }
    }

    public void salir(View v){
        finish();
    }
}