package com.example.usuario.proyectohospital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listaEmegency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaEmegency = (ListView)findViewById(R.id.lv01);

        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this, R.array.Emergencias_LLamar, android.R.layout.simple_list_item_1);
        listaEmegency.setAdapter(adaptador);
    }
}
