package com.example.fingerprint3.basicretrofit2;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("readcontact.php")
    Call<List<Contact>> getContacts();

}
