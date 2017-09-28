package xyz.wendyltanpcy.materialtest;

/**
 * Created by Wendy on 2017/9/25.
 */

public class Fruit {

    private String name;
    private int imageId;

    public Fruit(String name,int imageId){
        this.name = name;
        this.imageId = imageId;
    }

    public String getName(){
        return name;

    }

    public int getImageId() {
        return imageId;
    }
}
