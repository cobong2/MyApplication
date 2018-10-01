package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PrintStarActivity extends AppCompatActivity {
    private TextView tv = null,et = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print_star);

        getSupportActionBar().setTitle("별찍기");

        tv = findViewById(R.id.tv);
        et = findViewById(R.id.et);
    }
    public void clkEnter(View v) {
        String str = "";
        try {
            for (int i = 0; i < Integer.parseInt(et.getText().toString()); i++) {
                for (int j = 0; j <= i; j++) {
                    str += "*";
                }
                str += "\n";
            }
            tv.setText(str);
        } catch (Exception e) {
            tv.setText("");
        }
    }
}