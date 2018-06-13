package com.example.initialsetup.login.network;

import com.example.initialsetup.login.network.pojo.Login;

import retrofit2.Call;
import retrofit2.http.POST;
/**
 * This class represents the API interface for api call,all endpoints can stay here.
 *
 * @author Abhay Bhusari
 * @date 05/08/18.
 *
 */
public interface ApiInterface {

    @POST("login.asp")
    Call<Login> authenticate(String email, String password);
}
