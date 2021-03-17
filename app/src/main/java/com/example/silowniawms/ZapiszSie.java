package com.example.silowniawms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ZapiszSie extends AppCompatActivity {

    private ArrayAdapter<Zajecia> zajeciaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zapisz_sie);

        zajeciaAdapter = new ArrayAdapter<Zajecia>(this, android.R.layout.simple_list_item_1, Dane.getDostepneZajecia());
        ListView listView = findViewById(R.id.listZapiszSie);
        listView.setAdapter(zajeciaAdapter);

        ListOnClickListener listOnClickListener = new ListOnClickListener();
        listView.setOnItemClickListener(listOnClickListener);
    }

    class ListOnClickListener implements AdapterView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Dane.dodajWybrane(Dane.getDostepneZajecia().get(position));
            Dane.usunDostepne(position);
            zajeciaAdapter.notifyDataSetChanged();
        }
    }
}