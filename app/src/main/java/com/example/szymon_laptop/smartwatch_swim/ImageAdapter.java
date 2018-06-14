package com.example.szymon_laptop.smartwatch_swim;

import android.app.Activity;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.wear.widget.BoxInsetLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by Szymon_laptop on 13.06.2018.
 */

public class ImageAdapter extends PagerAdapter
{

    private Activity activity;
    private LayoutInflater inflater;
    private ArrayList<Integer> imagesId;
    private Boolean isRound;

    public ImageAdapter(Activity activity, ArrayList<Integer> imagesId)
    {
        this.activity = activity;
        this.imagesId = imagesId;

    }

    @Override
    public int getCount()
    {
        return imagesId.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object)
    {
        return view ==  object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position)
    {
        ImageView imageView;
       BoxInsetLayout layout = activity.findViewById(R.id.boxInsetLayout);
        //WatchViewStub layout = activity.findViewById(R.id.stub);

        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View viewLayout = inflater.inflate(R.layout.single_image, container, false);
        imageView = viewLayout.findViewById(R.id.imageView);

        imageView.setImageResource(imagesId.get(position));
        container.addView(viewLayout);

        return viewLayout;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object)
    {
       // ((ViewPager) container).removeView((RelativeLayout) object);

    }
}
