package com.example.tarea4_marcosmedina;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MunicipiosActivity extends ListActivity {
    String [] municipios;
    String departamento;
    Button btnAtras;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        btnAtras = (Button) findViewById(R.id.btnRegresar);
        departamento = getIntent().getStringExtra("depto");

        // Dependiendo del departamento, mostrar los municipios correspondientes
         municipios = getMunicipios(departamento);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, municipios);
        setListAdapter(adapter);


    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String muniSelect = municipios[position].toString();

        Intent intent = new Intent(MunicipiosActivity.this, DetallesActivity.class);
        intent.putExtra("depto", departamento);
        intent.putExtra("municipio", muniSelect);
        startActivity(intent);
    }
    public void atras(View v){
        finish();
    }

    private String[] getMunicipios(String departamento) {
        if ("Ahuachapán".equals(departamento)) {
            return getResources().getStringArray(R.array.ahuachapan);
        } else if ("Santa Ana".equals(departamento)) {
            return getResources().getStringArray(R.array.santana);
        } else if ("Sonsonate".equals(departamento)) {
            return getResources().getStringArray(R.array.sonsonate);
        } else if ("Usulután".equals(departamento)) {
            return getResources().getStringArray(R.array.usulutan);
        } else if ("San Miguel".equals(departamento)) {
            return getResources().getStringArray(R.array.sanmiguel);
        } else if ("Morazán".equals(departamento)) {
            return getResources().getStringArray(R.array.morazan);
        } else if ("La Unión".equals(departamento)) {
            return getResources().getStringArray(R.array.launion);
        } else if ("La Libertad".equals(departamento)) {
            return getResources().getStringArray(R.array.lalibertad);
        } else if ("Chalatenango".equals(departamento)) {
            return getResources().getStringArray(R.array.chalatenango);
        } else if ("Cuscatlán".equals(departamento)) {
            return getResources().getStringArray(R.array.cuscatlan);
        } else if ("San Salvador (la capital)".equals(departamento)) {
            return getResources().getStringArray(R.array.sansalvador);
        } else if ("La Paz".equals(departamento)) {
            return getResources().getStringArray(R.array.lapaz);
        } else if ("Cabañas".equals(departamento)) {
            return getResources().getStringArray(R.array.cabanas);
        } else if ("San Vicente".equals(departamento)) {
            return getResources().getStringArray(R.array.sanvicente);
        } else {
            return new String[]{};
        }
    }

}