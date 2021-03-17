package com.example.silowniawms;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onClickLogIn(View v) {
        EditText username = findViewById(R.id.editLogin);
        EditText password = findViewById(R.id.editPassword);
        if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {//correct password
            Intent intent = new Intent(this, MainScreen.class);
            startActivity(intent);
        } else {//wrong password
            TextView textViewAddress = findViewById(R.id.loginInfo);
            textViewAddress.setText("Niepoprwany login lub hasło!");
        }

    }
}