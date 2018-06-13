package com.example.initialsetup.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.initialsetup.home.MainActivity;
import com.example.initialsetup.R;
import com.example.initialsetup.registration.RegistrationActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
/**
 * This class represents the Login Activity .
 *
 * @author Abhay Bhusari
 * @date 05/08/18.
 *
 */
public class LoginActivity extends AppCompatActivity implements View.OnClickListener, LoginView {

    @BindView(R.id.edtLoginEmail) EditText edtEmai;
    @BindView(R.id.edtLoginPasswor)EditText edtPassword;
    @BindView(R.id.btnLogin)Button btnLogin;
    @BindView(R.id.btnNewRegistration)Button btnNewRegistration;

    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        btnLogin.setOnClickListener(this);
        btnNewRegistration.setOnClickListener(this);
        loginPresenter = new LoginPresenterImplement(LoginActivity.this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnLogin) {
            String email = edtEmai.getText().toString().trim();
            String password = edtPassword.getText().toString().trim();
            loginPresenter.performLogin(email, password);
        }

        if (v.getId() == R.id.btnNewRegistration) {
            loginPresenter.goToRegistration();
        }
    }

    @Override
    public void loginValidation() {
        Toast.makeText(this, "Enter the email and password.", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginError() {
        Toast.makeText(this, "enter valide email and address", Toast.LENGTH_LONG).show();
    }

    @Override
    public void loginSuccess() {
        Intent intent = new Intent(this, MainActivity.class);
        Toast.makeText(this, "You are successfully login", Toast.LENGTH_LONG).show();
        startActivity(intent);
        finish();
    }

    @Override
    public void startRegistrationActivity() {
        Intent intent = new Intent(this, RegistrationActivity.class);
        startActivity(intent);
    }
}
