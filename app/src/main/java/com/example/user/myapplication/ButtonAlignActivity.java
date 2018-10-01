package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ButtonAlignActivity extends AppCompatActivity {
    private TextView btn_1 = null, btn_2 = null, btn_3 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_align);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
    }

    public void clkBtn(View v) {
        Button btn = (Button)v;

        if(btn.getId() == R.id.btn_1){
            btn_1.setText("버튼1");
            btn_2.setText("0");
            btn_3.setText("0");
        }else if(btn.getId() == R.id.btn_2){
            btn_1.setText("0");
            btn_2.setText("버튼2");
            btn_3.setText("0");
        }else if(btn.getId() == R.id.btn_3){
            btn_1.setText("0");
            btn_2.setText("0");
            btn_3.setText("버튼3");
        }
    }
}
