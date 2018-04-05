package com.example.mrrobot.myapp.SpotifyApi.Models;

import java.util.Arrays;

/**
 * Created by micha on 10/03/2018.
 */

public class Album {
    private String id;
    private String label;
    private String name;
    private String popularity;
    private String release_date;
    //private Tracks tracks;
    private String album_type;
    /*private  String[] artists;
    private String[] genres;*/

    @Override
    public String toString() {
        return "Album{" +
                "id='" + id + '\'' +
                ", label='" + label + '\'' +
                ", name='" + name + '\'' +
                ", popularity='" + popularity + '\'' +
                ", release_date='" + release_date + '\'' +
                ", album_type='" + album_type + '\'' +
                /*", artists=" + Arrays.toString(artists) +
                ", genres=" + Arrays.toString(genres) +*/
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getAlbum_type() {
        return album_type;
    }

    public void setAlbum_type(String album_type) {
        this.album_type = album_type;
    }

    /*public String[] getArtists() {
        return artists;
    }

    public void setArtists(String[] artists) {
        this.artists = artists;
    }

    public String[] getGenres() {
        return genres;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }*/
}
