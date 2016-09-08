package com.sociabuzz.Android;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.sociabuzz.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread background = new Thread() {
            public void run() {
                try {
                    sleep(1 * 1000);

                    Intent i = new Intent(getBaseContext(), LoginActivity.class);
                    startActivity(i);

                    finish();
                } catch (Exception e) {

                }
            }
        };
        background.start();
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();

    }
}
