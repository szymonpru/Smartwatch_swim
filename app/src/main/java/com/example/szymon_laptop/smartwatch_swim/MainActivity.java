package com.example.szymon_laptop.smartwatch_swim;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.wearable.activity.WearableActivity;

import java.util.ArrayList;

public class MainActivity extends WearableActivity
{

    private ViewPager viewPager;
    private ArrayList<Integer> images;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setAmbientEnabled();

        initImages();
        setPagerAdapter();

    }


    public void setPagerAdapter()
    {
        this.viewPager = findViewById(R.id.pager);
        this.viewPager.setAdapter(new ImageAdapter(MainActivity.this, images));

    }

    public void initImages()
    {
        images = new ArrayList<>();
        images.add(R.drawable.image_1);
        images.add(R.drawable.image_2);
        images.add(R.drawable.image_3);
        images.add(R.drawable.image_4);
        images.add(R.drawable.image_5);
        images.add(R.drawable.image_6);


    }


}
