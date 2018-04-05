package com.example.mrrobot.myapp.SpotifyApi;

/**
 * Created by micha on 10/03/2018.
 */
import retrofit2.Retrofit;

import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


public class SpotifyApiAdapter {

    private static Retrofit RETROFIT;
    private static SpotifyApiService spotifyApiService;
    public static SpotifyApiService getInstance(){
        //The adapter will be a singleton
        if(RETROFIT == null)
            RETROFIT = new Retrofit.Builder()
                    .baseUrl(SpotifyApiConstants.BASE_URL)



                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();

        spotifyApiService=RETROFIT.create(SpotifyApiService.class);

        return spotifyApiService;
    }
    /*public static Retrofit getInstance(){
        //The adapter will be a singleton
        if(RETROFIT == null)
            RETROFIT = new Retrofit.Builder()
                    .baseUrl(SpotifyApiConstants.BASE_URL)

                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build();

        spotifyApiService=RETROFIT.create(SpotifyApiService.class);
        return RETROFIT;
    }*/

}
