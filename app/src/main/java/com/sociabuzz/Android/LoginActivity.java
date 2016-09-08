package com.sociabuzz.Android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.sociabuzz.R;

public class LoginActivity extends AppCompatActivity {

    private EditText mEditTextEmailLogin;
    private EditText mEditTextPasswordLogin;
    private ImageButton mButtonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mEditTextEmailLogin = (EditText)findViewById(R.id.et_email);
        mEditTextPasswordLogin = (EditText)findViewById(R.id.et_password);
        mButtonLogin = (ImageButton)findViewById(R.id.bt_login);
        mButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}
