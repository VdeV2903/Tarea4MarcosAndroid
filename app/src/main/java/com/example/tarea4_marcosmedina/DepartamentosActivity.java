package com.example.tarea4_marcosmedina;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DepartamentosActivity extends ListActivity {
    String[] nombresDepartamentos;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        nombresDepartamentos = getResources().getStringArray(R.array.departamentos);

        ArrayAdapter<String> lista;
        lista = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,nombresDepartamentos);
        setListAdapter(lista);

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String deptosSelect = nombresDepartamentos[position].toString();
        Intent intent = new Intent(DepartamentosActivity.this, MunicipiosActivity.class);
        intent.putExtra("depto", deptosSelect);

        startActivity(intent);
    }
}