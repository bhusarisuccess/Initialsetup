package com.example.initialsetup.registration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.initialsetup.R;
import com.example.initialsetup.login.LoginActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RegistrationActivity extends AppCompatActivity implements View.OnClickListener, RegistrationView {

    @BindView(R.id.edtRegistrationEmail) EditText edtEmail;
    @BindView(R.id.edtRegistrationPasswor)EditText edtPassword;
    @BindView(R.id.edtRegistrationConfirmPasswor)EditText edtConfirmPassword;
    @BindView(R.id.btnRegistrationSubmit)Button btnSubmit;

    RegistrationPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        ButterKnife.bind(this);
        btnSubmit.setOnClickListener(this);
        presenter = new RegistrationPresenterImplimentation(RegistrationActivity.this);
    }

    @Override
    public void onClick(View v) {
        String email = edtEmail.getText().toString().trim();
        String password = edtPassword.getText().toString().trim();
        String confirmPassword = edtPassword.getText().toString().trim();
        if(v.getId()==R.id.btnRegistrationSubmit){
            presenter.registrationOpration(email,password,confirmPassword);
        }

    }

    @Override
    public void registrationValidation() {
        Toast.makeText(this, "Enter the email and password.", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void registrationError() {
        Toast.makeText(this, "enter valide email and address", Toast.LENGTH_LONG).show();
    }

    @Override
    public void registrationSuccess() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
