package com.example.mrrobot.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.mrrobot.myapp.Models.Pokemon;
import com.example.mrrobot.myapp.Services.PokeApiClient;
import com.example.mrrobot.myapp.Services.PokeApiService;
import com.example.mrrobot.myapp.SpotifyApi.Models.Album;
import com.example.mrrobot.myapp.SpotifyApi.Models.Credential;
import com.example.mrrobot.myapp.SpotifyApi.SpotifyApiAdapter;
import com.example.mrrobot.myapp.SpotifyApi.SpotifyApiService;
import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.maps.MapView;

import org.json.JSONException;
import org.json.JSONObject;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.EventListener;
import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Observable;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.operators.observable.ObservableElementAtSingle;
import io.reactivex.schedulers.Schedulers;

import io.socket.client.IO;


import io.socket.emitter.Emitter;
import io.socket.engineio.client.Socket;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;



public class MainActivity extends AppCompatActivity {

    private MapView mapView;
    private PokeApiClient pokeApiClient = new PokeApiClient();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String token="pk.eyJ1IjoibXJtaWNoYWVsYm90IiwiYSI6ImNqZHpiamNnNzBwMXYycXA5cXh2M2xnZjcifQ.iqfPeoVbpWQcLG8bvf9qzw";


        Mapbox.getInstance(this, token);
        mapView = (MapView) findViewById(R.id.mapView);
        mapView.onCreate(savedInstanceState);
        Button btnRegister = (Button) findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "REGISTER", Toast.LENGTH_LONG).show();
            }
        });

        io.socket.client.Socket socket;
        socket = ((ChatApp) getApplication()).getSocket();

        socket.connect();
        socket.on("saludo", new Emitter.Listener() {
            @Override
            public void call(Object... args) {
                JSONObject data = (JSONObject) args[0];
                Toast.makeText(MainActivity.this, data.toString(), Toast.LENGTH_LONG).show();


                //System.out.println(data.toString());


            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();
        mapView.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
        mapView.onStop();
    }



    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }

}
