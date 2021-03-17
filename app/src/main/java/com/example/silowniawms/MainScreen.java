package com.example.silowniawms;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import java.util.ArrayList;

public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);


        Dane.getInstance();
    }

    public void onClickRezerwacja(View v) {
        Intent intent = new Intent(this, Rezerwacje.class);
        startActivity(intent);
    }

    public void onClickZapisy(View v) {
        Intent intent = new Intent(this, ZapiszSie.class);
        startActivity(intent);
    }

    public void onClickHistoria(View v) {
        Intent intent = new Intent(this, Historia.class);
        startActivity(intent);
    }

    public void onClickUstawienia(View v) {
        Intent intent = new Intent(this, Ustawienia.class);
        startActivity(intent);
    }
}