package com.example.sleep_shift;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class About extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);



        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        //Set Home selected
        bottomNavigationView.setSelectedItemId(R.id.about);
        //perfform item seected listener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case R.id.dashbaord:
                        startActivity(new Intent(getApplicationContext()
                                ,DashBoard.class));
                        overridePendingTransition(0,0);

                        return true;
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext()
                                ,MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.about:
                        return true;

                }
                return false;
            }
        });

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this)); // it will create recycler view in linear layout

        myAdapter =new MyAdapter(this,getMyList());
        mRecyclerView.setAdapter(myAdapter);



    }
    private ArrayList<Model> getMyList() {

        ArrayList<Model> models = new ArrayList<>();

        Model m=new Model();
        m.setTittle("Day 1");
        m.setDescription("Exercise plan of day 1");
        m.setImg(R.drawable.one);
        models.add(m);

        m=new Model();
        m.setTittle("Day 2");
        m.setDescription("Exercise plan of day 2");
        m.setImg(R.drawable.two);
        models.add(m);

        m=new Model();
        m.setTittle("Day 3");
        m.setDescription("Exercise plan of day 3");
        m.setImg(R.drawable.three);
        models.add(m);

        return models;


    }
}