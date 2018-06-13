package com.example.initialsetup.login;

import android.text.TextUtils;
import android.widget.Toast;

import com.example.initialsetup.login.network.ApiClient;
import com.example.initialsetup.login.network.ApiInterface;
import com.example.initialsetup.login.network.pojo.Login;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * This class represents the model module for login  .
 *
 * @author Abhay Bhusari
 * @date 05/08/18.
 */
public class LoginPresenterImplement implements LoginPresenter {

    LoginView loginView;
    ApiInterface apiInterface;

    /**
     * This constructor initialies loginView object and ApiInterface.
     */
    public LoginPresenterImplement(LoginView loginView) {

        this.loginView = loginView;
        this.apiInterface = ApiClient.getAPiClient().create(ApiInterface.class);
    }

    /**
     * This method perform the opration for user login/ authentication.
     */
    @Override
    public void performLogin(String email, String password) {


        /*Call<Login> loginServise = apiInterface.authenticate(email, password);
        loginServise.enqueue(new Callback<Login>() {
            @Override
            public void onResponse(Call<Login> call, Response<Login> response) {
                Login mLoginObject = response.body();
                String returnedResponse = mLoginObject.isLogin;

                //showProgress(false);
                if (returnedResponse.trim().equals("1")) {
                    // redirect to Main Activity page
                    loginView.loginSuccess();
                }
                if (returnedResponse.trim().equals("0")) {
                    // use the registration button to register
                    loginView.loginError();
                }
            }

            @Override
            public void onFailure(Call<Login> call, Throwable t) {
                call.cancel();
                //Toast.makeText(loginView.this, "Please check your network connection and internet permission", Toast.LENGTH_LONG).show();
                //loginView.loginError();
            }
        });*/

        if(TextUtils.isEmpty(email)|| TextUtils.isEmpty(password)){
            loginView.loginValidation();
        }
        else {
            if(email.equals("abhay") && password.equals("1234")){
                loginView.loginSuccess();
            }
            else {
                loginView.loginError();
            }
        }

    }


    @Override
    public void goToRegistration() {
        loginView.startRegistrationActivity();
    }
}