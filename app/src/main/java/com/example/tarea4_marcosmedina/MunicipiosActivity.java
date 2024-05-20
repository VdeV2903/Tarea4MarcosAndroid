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
        switch (departamento) {
            case "Ahuachapán":
                return getResources().getStringArray(R.array.ahuachapan);
            case "Santa Ana":
                return getResources().getStringArray(R.array.santana);
            case "Sonsonate":
                return getResources().getStringArray(R.array.sonsonate);
            case "Usulután":
                return getResources().getStringArray(R.array.usulutan);
            case "San Miguel":
                return getResources().getStringArray(R.array.sanmiguel);
            case "Morazán":
                return getResources().getStringArray(R.array.morazan);
            case "La Unión":
                return getResources().getStringArray(R.array.launion);
            case "La Libertad":
                return getResources().getStringArray(R.array.lalibertad);
            case "Chalatenango":
                return getResources().getStringArray(R.array.chalatenango);
            case "Cuscatlán":
                return getResources().getStringArray(R.array.cuscatlan);
            case "San Salvador (la capital)":
                return getResources().getStringArray(R.array.sansalvador);
            case "La Paz":
                return getResources().getStringArray(R.array.lapaz);
            case "Cabañas":
                return getResources().getStringArray(R.array.cabanas);
            case "San Vicente":
                return getResources().getStringArray(R.array.sanvicente);
            // Agrega más casos según sea necesario
            default:
                return new String[]{};
        }
    }
}