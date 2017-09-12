package com.example.wendy.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Fruit> mFruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        FruitAdapter adapter = new FruitAdapter(MainActivity.this,R.layout.fruit_item,mFruitList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Fruit fruit = mFruitList.get(i);
                Toast.makeText(MainActivity.this,fruit.getName(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initFruits() {
        for (int i=0;i<2;i++){
            Fruit apple = new Fruit("Apple",R.mipmap.ic_launcher);
            mFruitList.add(apple);
            Fruit banana = new Fruit("banana",R.mipmap.ic_launcher);
            mFruitList.add(banana);
            Fruit Orange = new Fruit("Orange",R.mipmap.ic_launcher);
            mFruitList.add(Orange);
            Fruit Pear = new Fruit("Pear",R.mipmap.ic_launcher);
            mFruitList.add(Pear);
            Fruit Watermelon = new Fruit("Watermelon",R.mipmap.ic_launcher);
            mFruitList.add(Watermelon);
            Fruit Grape = new Fruit("Grape",R.mipmap.ic_launcher);
            mFruitList.add(Grape);
            Fruit ineapple = new Fruit("ineapple",R.mipmap.ic_launcher);
            mFruitList.add(ineapple);
            Fruit Strawberry= new Fruit("Strawberry",R.mipmap.ic_launcher);
            mFruitList.add(Strawberry);
            Fruit Cherry = new Fruit("Cherry",R.mipmap.ic_launcher);
            mFruitList.add(Cherry);
        }
    }
}
