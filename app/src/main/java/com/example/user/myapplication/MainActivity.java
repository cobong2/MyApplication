package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv_wtf = null, tv_sob = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_wtf = findViewById(R.id.tv_wtf);
        tv_sob = findViewById(R.id.tv_sob);

        tv_wtf.setText(R.string.change);
        tv_sob.setText("뷍렝렝렐엘엘레레레");

    }
}
