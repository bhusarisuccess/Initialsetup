package com.example.initialsetup.login;

/**
 * This class represents the Presenter module for login  .
 *
 * @author Abhay Bhusari
 * @date 05/08/18.
 *
 */
public interface LoginPresenter {
    void performLogin(String email, String password);
    void goToRegistration();

}
