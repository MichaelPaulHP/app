package com.example.mrrobot.myapp.Services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;


import retrofit2.converter.gson.GsonConverterFactory;




public class PokeApiClient {
    private Retrofit retrofit;
    private final static String BASE_URL = "http://pokeapi.co/api/v2/";

    public PokeApiClient() {
        // RxJava
        //RxJavaCallAdapterFactory rxAdapter = RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io());


        // gson
        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .create();

        this.retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }

    public PokeApiService getPokeApiService() {
        return this.retrofit.create(PokeApiService.class);
    }
}
