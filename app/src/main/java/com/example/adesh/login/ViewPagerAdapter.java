package com.example.adesh.login;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by adesh on 22/9/17.
 */

public class ViewPagerAdapter extends PagerAdapter{
    private Context context;
    private LayoutInflater layoutInflator;
    private Integer [] images={R.drawable.summit,R.drawable.index};

    public ViewPagerAdapter(Context context){
        this.context=context;
    }
    @Override
    public int getCount(){
        return images.length;
    }


    @Override
    public Object instantiateItem(ViewGroup container,int position){
        layoutInflator=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflator.inflate(R.layout.custom_layout,null);
        ImageView imageView=(ImageView) view.findViewById(R.id.imageView);
        imageView.setImageResource(images[position]);

        ViewPager vp=(ViewPager) container;
        vp.addView(view,0);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container,int position,Object object){
        ViewPager vp=(ViewPager) container;
        View view=(View) object;
        vp.removeView(view);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

}
