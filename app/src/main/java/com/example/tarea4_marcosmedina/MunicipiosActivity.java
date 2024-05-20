package com.example.tarea4_marcosmedina;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MunicipiosActivity extends ListActivity {
    String [] nombresMuni;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String departamento = getIntent().getStringExtra("departamento");

        // Dependiendo del departamento, mostrar los municipios correspondientes
        String[] municipios = getMunicipios(departamento);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, municipios);
        setListAdapter(adapter);
    }

    private String[] getMunicipios(String departamento) {
        switch (departamento) {
            case "santana":
                return getResources().getStringArray(R.array.santana);
            case "Departamento 2":
                return getResources().getStringArray(R.array.sanmiguel);
            // Agrega más casos según sea necesario
            default:
                return new String[]{};
        }
    }
}