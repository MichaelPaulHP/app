package com.example.mrrobot.myapp.SpotifyApi;

import com.example.mrrobot.myapp.Services.Base64;
import com.example.mrrobot.myapp.SpotifyApi.Models.Album;
import com.example.mrrobot.myapp.SpotifyApi.Models.Credential;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;

import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;



/**
 * Created by micha on 10/03/2018.
 */

public interface SpotifyApiService {
     String authorization="";

    // get Token
    @FormUrlEncoded
    @Headers(SpotifyApiConstants.GETAUTHORIZATION)
    @POST(SpotifyApiConstants.URL_TOKEN)
    Call<Credential> getToken(@Field("grant_type") String client_credentials);

    //Albums
    //@Headers("Authorization: Bearer {Token}")
    @GET(SpotifyApiConstants.URL_ALBUMS)
    Observable<Album> getAlbums (@Header("Authorization") String Token, @Query("ids") String ids);
    //Call<List<Album>> getAlbums (@Header("Authorization") String Token, @Query("ids") String ids);
    @GET(SpotifyApiConstants.URL_ALBUM)
    Observable<Album> getAlbum (@Header("Authorization") String Token, @Path("id") String id);
    /*@GET(SpotifyApiConstants.ARTIST_SEARCH_URL)
    Observable<ArtistSearchResponse> searchArtist(@Query(SpotifyApiConstants.QUERY_TO_SEARCH) String query);*/

}
