package com.example.silowniawms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Historia extends AppCompatActivity {

    private ArrayAdapter<Zajecia> historiaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia);

        historiaAdapter = new ArrayAdapter<Zajecia>(this, android.R.layout.simple_list_item_1, Dane.getHistoria());
        ListView listView = findViewById(R.id.listHistoria);
        listView.setAdapter(historiaAdapter);

        ListOnClickListener listOnClickListener = new ListOnClickListener();
        listView.setOnItemClickListener(listOnClickListener);
    }

    class ListOnClickListener implements AdapterView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            historiaAdapter.notifyDataSetChanged();
        }
    }
}