package com.example.initialsetup.registration;

import android.text.TextUtils;

public class RegistrationPresenterImplimentation implements RegistrationPresenter{
   private RegistrationView registrationView;

    public RegistrationPresenterImplimentation(RegistrationView registrationView) {
        this.registrationView = registrationView;
    }

    @Override
    public void registrationOpration(String email, String password, String confirmPassword) {

        if(TextUtils.isEmpty(email)|| TextUtils.isEmpty(password)|| TextUtils.isEmpty(confirmPassword)){
            registrationView.registrationValidation();
        }
        else {
            if(password.equals(confirmPassword)){
                registrationView.registrationSuccess();
            }
            else {
                registrationView.registrationError();
            }
        }
    }
}
