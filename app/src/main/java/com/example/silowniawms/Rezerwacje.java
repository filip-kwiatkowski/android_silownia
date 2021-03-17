package com.example.silowniawms;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Rezerwacje extends AppCompatActivity {

    private ArrayAdapter<Zajecia> zajeciaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rezerwacje);

        zajeciaAdapter = new ArrayAdapter<Zajecia>(this, android.R.layout.simple_list_item_1, Dane.getWybraneZajecia());
        ListView listView = findViewById(R.id.listRezerwacje);
        listView.setAdapter(zajeciaAdapter);

        ListOnClickListener listOnClickListener = new ListOnClickListener();
        listView.setOnItemClickListener(listOnClickListener);
        listView.setOnItemLongClickListener(listOnClickListener);
    }

    class ListOnClickListener implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Dane.dodajDostepne(Dane.getWybraneZajecia().get(position));
            Dane.usunWybrane(position);
            zajeciaAdapter.notifyDataSetChanged();
        }

        @Override
        public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
            Dane.dodajHistorie(Dane.getWybraneZajecia().get(position));
            Dane.usunWybrane(position);
            zajeciaAdapter.notifyDataSetChanged();
            return true;
        }
    }
}