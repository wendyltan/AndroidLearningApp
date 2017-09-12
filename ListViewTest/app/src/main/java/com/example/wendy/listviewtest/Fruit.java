package com.example.wendy.listviewtest;

/**
 * Created by Wendy on 2017/9/4.
 */

public class Fruit  {

    private String name;
    private int imageID;

    public Fruit(String name,int imageID) {
        this.name = name;
        this.imageID = imageID;
    }

    public String getName() {
        return name;
    }

    public int getImageID() {
        return imageID;
    }
}
