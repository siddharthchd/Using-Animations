package com.example.siddh.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view) {

        ImageView naruto = (ImageView) findViewById(R.id.naruto);
        naruto.animate()
                .rotation(1800f)
                .scaleX(1f)
                .scaleY(1f)
                .alpha(1f)
                .setDuration(2000);
        ImageView itachi = (ImageView) findViewById(R.id.itachi);
        itachi.animate().alpha(0f).setDuration(2000);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView naruto = (ImageView) findViewById(R.id.naruto);
        naruto.setAlpha(0f);
        naruto.setScaleX(0.5f);
        naruto.setScaleY(0.5f);
    }
}
