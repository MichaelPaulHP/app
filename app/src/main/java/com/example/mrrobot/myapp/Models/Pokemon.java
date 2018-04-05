package com.example.mrrobot.myapp.Models;

/**
 * Created by micha on 9/03/2018.
 */

public class Pokemon {
    private Integer id;
    private String name;
    private Integer base_experience;
    private Integer height;

    // toString

    @Override
    public String toString() {
        String str="name: "+this.name + "  base_exp: "+this.base_experience;
        return str;
    }

    //  GETTER AND SETTER

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBase_experience() {
        return base_experience;
    }

    public void setBase_experience(Integer base_experience) {
        this.base_experience = base_experience;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}
