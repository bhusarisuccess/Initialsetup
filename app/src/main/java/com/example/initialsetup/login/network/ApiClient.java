package com.example.initialsetup.login.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
/**
 * This class represents the API client .
 *
 * @author Abhay Bhusari
 * @date 05/08/18.
 *
 */
public class ApiClient {
    public  static final String BASE_URL="https://www.google.co.in/";
    public static Retrofit retrofit= null;


    /**
     * This method return instance of the Retrofit.
     *
     * @return The Retrofit instance
     */
    public static Retrofit getAPiClient(){
        if(retrofit==null){
            retrofit= new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }

}
