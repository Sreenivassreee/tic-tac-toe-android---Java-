package com.stevebrains.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button one,two,Three,Four,Five,Six,Seven,Eight,Nine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one=findViewById(R.id.One);
        two=findViewById(R.id.Two);
        Three=findViewById(R.id.Three);
        Four=findViewById(R.id.Four);
        Five=findViewById(R.id.Five);
        Six=findViewById(R.id.Six);
        Seven=findViewById(R.id.Seven);
        Eight=findViewById(R.id.Eight);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(one.getText().toString().equals("")){

                }
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "One", Toast.LENGTH_SHORT).show();
            }
        });
        Three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "One", Toast.LENGTH_SHORT).show();
            }
        });Four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "One", Toast.LENGTH_SHORT).show();
            }
        });Five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "One", Toast.LENGTH_SHORT).show();
            }
        });Six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "One", Toast.LENGTH_SHORT).show();
            }
        });Seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "One", Toast.LENGTH_SHORT).show();
            }
        });
    }


}