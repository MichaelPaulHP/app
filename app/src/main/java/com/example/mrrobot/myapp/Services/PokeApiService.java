package com.example.mrrobot.myapp.Services;

import com.example.mrrobot.myapp.Models.Pokemon;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;



public interface PokeApiService {

    @GET("pokemon/{name}") // x is id or name
    Call<Pokemon> getPokemon(@Path("name") String name);


}
