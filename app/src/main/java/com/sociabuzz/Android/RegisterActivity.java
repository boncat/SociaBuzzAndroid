package com.sociabuzz.Android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.sociabuzz.R;

public class RegisterActivity extends AppCompatActivity {

    private ImageView ivLogo;
    private EditText mEditTextFirstName;
    private EditText mEditTextLastName;
    private EditText mEditTextHandpone;
    private EditText mEditTextEmail;
    private EditText mEditTextPassword;
    private EditText mEditTextConfirmPassword;
    private EditText mEditTextTermCondition;
    private CheckBox mCheckBoxRegister;
    private TextView mTextViewTermCondition;
    private EditText mEditTextRegisterRemark;
    private Button mButtonRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mEditTextFirstName = (EditText) findViewById(R.id.et_first_name);
        mEditTextLastName = (EditText) findViewById(R.id.et_last_name);
        mEditTextHandpone = (EditText) findViewById(R.id.et_register_handpone);
        mEditTextEmail = (EditText) findViewById(R.id.et_email);
        mEditTextPassword = (EditText) findViewById(R.id.et_password);
        mEditTextConfirmPassword = (EditText) findViewById(R.id.et_confirm_password);
        mEditTextTermCondition = (EditText) findViewById(R.id.et_confirm_password);
        mEditTextTermCondition = (EditText) findViewById(R.id.et_term_condition);
        mCheckBoxRegister = (CheckBox) findViewById(R.id.cb_register);
        mTextViewTermCondition = (TextView) findViewById(R.id.tv_term_condition);
        mEditTextRegisterRemark = (EditText) findViewById(R.id.et_register_remark);
        mButtonRegister = (Button) findViewById(R.id.btn_register);
    }
}
