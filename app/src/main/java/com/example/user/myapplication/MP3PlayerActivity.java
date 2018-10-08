package com.example.user.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MP3PlayerActivity extends AppCompatActivity {
    private MediaPlayer mp = null;
    private  Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mp3_player);
        setTitle(R.string.mp3Title);

        btn3 = findViewById(R.id.btn3);
    }

    public void mp3Btn(View v) {
        Log.i("test", "mp3Btn : " + v.getId());

        switch (v.getId()) {
            case R.id.btn1:
                _doStop();
                mp = MediaPlayer.create(this, R.raw.twicecheerup);
                mp.start();
                btn3.setText(R.string.pause);
                break;

            case R.id.btn2:
                _doStop();
                mp = MediaPlayer.create(this, R.raw.redvelvetpeekaboo);
                mp.start();
                btn3.setText(R.string.pause);
                break;

            case R.id.btn3:
                if (mp == null) {
                    return;
                }

                Button btn = (Button) v;
                String txt = btn.getText().toString();

                if (txt.equals(getString(R.string.pause))) { // 음악 재생 중
                    btn.setText(R.string.play); // 재생
                    mp.pause(); // 일시정지 시킴
                } else { // 음악 일시정지 중
                    btn.setText(R.string.pause); //일시정지
                    mp.start();
                    // 재생 시킴
                }
                break;

            case R.id.btn4:
                _doStop();
                btn3.setText(R.string.pause);
                break;
        }
    }

    private void _doStop() {
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }
}
