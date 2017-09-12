package com.example.wendy.recyclerviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Created by Wendy on 2017/9/4.
     */

    public static class Fruit {
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
}
