package com.sociabuzz.Android;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.sociabuzz.R;


public class LoginActivity extends AppCompatActivity {

    private EditText mEditTextEmailLogin;
    private EditText mEditTextPasswordLogin;
    private ImageButton mButtonLogin;
    private TextView mTextViewRegisterHelp;
    private TextView mTextViewRegister;
    private TextView mTextViewForgotPassword;

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
        mTextViewRegisterHelp = (TextView)findViewById(R.id.tv_register_help);
        mTextViewRegisterHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), RegisterActivity.class);
                startActivity(i);
            }
        });
        mTextViewRegister = (TextView)findViewById(R.id.tv_register);
        mTextViewForgotPassword = (TextView)findViewById(R.id.tv_forgot_password);
        mTextViewForgotPassword.setText(Html.fromHtml(getString(R.string.forgot_password_text_view)));
        mTextViewForgotPassword.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
        mTextViewForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContextThemeWrapper ctw = new ContextThemeWrapper(LoginActivity.this,
                        R.style.Theme_App);
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(ctw);
                LayoutInflater inflater = (LoginActivity.this.getLayoutInflater());
                View dialogView = inflater.inflate(R.layout.dialog_forgot_password, null);
                alertDialogBuilder.setView(dialogView);
                alertDialogBuilder.setTitle("Forgot Password");
                alertDialogBuilder.setCancelable(false
                );

                TextView textview_forget = (TextView) dialogView.findViewById(R.id.text_forget);
                final EditText edittext_forget = (EditText) dialogView.findViewById(R.id.edittext_forget);

                alertDialogBuilder.setPositiveButton("Cancel",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {

                            }
                        });
                alertDialogBuilder.setNegativeButton("Done",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String emailforget = edittext_forget.getText().toString();
//                                submit(setupParamsForgot(emailforget), APIKeys.API_FORGOT_PASSWORD, "ForgotPassword", "Email");
                            }
                        });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });


    }

}
