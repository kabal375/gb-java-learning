package com.example.firstandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button changeButton1 = findViewById(R.id.switch_to_inputs_button);


        changeButton1.setOnClickListener(view1 -> setContentView(R.layout.activity_inputs));


    }
}