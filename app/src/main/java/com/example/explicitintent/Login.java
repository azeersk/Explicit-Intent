package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.time.Instant;

public class Login extends AppCompatActivity {
    TextView inside;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        inside = (TextView) findViewById(R.id.Inside);
        Intent intent = getIntent();
        String name = intent.getStringExtra("TextIndex");
        inside.setText("Your name is: " + name);
    }
}