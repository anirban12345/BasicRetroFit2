package com.example.fingerprint3.basicretrofit2;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static final String BaseUrl="http://www.studydigitally.com/testretrofit/";
    public static Retrofit retrofit=null;

    public static Retrofit getApiClient()
    {
        if(retrofit==null) {
            retrofit = new Retrofit.Builder().baseUrl(BaseUrl)
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
