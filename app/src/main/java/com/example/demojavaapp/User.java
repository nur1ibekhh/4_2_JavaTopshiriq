package com.example.demojavaapp;

import java.io.Serializable;

public class User implements Serializable {
    private int age;
    private String name;

    public User(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return age+" "+name;
    }
}
