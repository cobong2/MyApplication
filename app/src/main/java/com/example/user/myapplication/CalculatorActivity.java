package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {
    private EditText et1, et2;
    private TextView tv1, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        setTitle(R.string.calcTitle);

        init();
    }

    private void init() {
        et1 = findViewById(R.id.et1);
        et1.setShowSoftInputOnFocus(false);
        et2 = findViewById(R.id.et2);
        et2.setShowSoftInputOnFocus(false);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);

    }

    public void clkRightBtn(View v) {
        if (v instanceof Button) {
            Button b = (Button) v;
            String str = b.getText().toString();

            if (str.equals("C")) {
                et1.setText("");
                et2.setText("");
                tv1.setText("");
                tv2.setText("");
            } else {
                tv1.setText(b.getText().toString());
            }
        }
    }

    public void clkNumber(View v) {
        Log.i("test", "이벤트 연결 성공!");

        if (v instanceof Button) {
            Button b = (Button) v;
            String str1 = et1.getText().toString();
            String str2 = et2.getText().toString();

            str1 += b.getText().toString();
            str2 += b.getText().toString();

            if (tv1.getText().toString().equals("")) {
                et1.setText(str1);
            } else {
                et2.setText(str2);
            }
        }
    }

    private int checkInt(String str) {
        int result = 0;
        try {
            result = Integer.parseInt(str);
        } catch (Exception e) {

        }
        return result;
    }

    public void clkResult(View v) {
        String str1 = et1.getText().toString();
        String str2 = et2.getText().toString();

        String calcSymbol = tv1.getText().toString();

        int i = checkInt(str1);
        int j = checkInt(str2);

        if (str1.equals("")) {
            tv2.setText("첫번째값을 입력하세요");
        } else if (calcSymbol.equals("")) {
            tv2.setText("수식을 입력하세요");
        } else if (str2.equals("")) {
            tv2.setText("두번째값을 입력하세요");
        } else if (calcSymbol.equals("+")) {
            tv2.setText(String.valueOf(i + j));
        } else if (calcSymbol.equals("-")) {
            tv2.setText(String.valueOf(i - j));
        } else if (calcSymbol.equals("*")) {
            tv2.setText(String.valueOf(i * j));
        } else if (calcSymbol.equals("/")) {
            if (str2.equals("0")) {
                tv2.setText("0으로 나눌 수 없습니다.");
            } else {
                tv2.setText(String.valueOf((double)i / j));
            }
        }
    }
}