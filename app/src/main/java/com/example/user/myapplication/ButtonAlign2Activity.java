package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonAlign2Activity extends AppCompatActivity {
    private Button calc, mp3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_align2);
        setTitle("Main");

        init();
    }
    public void init() {
        calc = findViewById(R.id.btn1);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonAlign2Activity.this, "계산기", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ButtonAlign2Activity.this, CalculatorActivity.class);
                startActivity(intent);
            }
        });

        mp3 = findViewById(R.id.btn2);
        mp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonAlign2Activity.this, "MP3", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ButtonAlign2Activity.this, MP3PlayerActivity.class);
                startActivity(intent);
            }
        });
    }
}
