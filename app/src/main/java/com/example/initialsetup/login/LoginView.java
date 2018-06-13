package com.example.initialsetup.login;
/**
 * This class represents the View module for login  .
 *
 * @author Abhay Bhusari
 * @date 05/08/18.
 *
 */
public interface LoginView {
    void loginValidation();
    void loginError();
    void loginSuccess();
    void startRegistrationActivity();

}
