package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c){
        mContext=c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position){
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }



    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if (convertView==null){
            imageView=new ImageView(mContext);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(185,185));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8,8,8,8);
        }
        else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    public Integer[] mThumbIds ={
            R.drawable.images,R.drawable.images,
            R.drawable.images,R.drawable.images,
            R.drawable.images,R.drawable.images,
            R.drawable.images,R.drawable.images,
            R.drawable.images,R.drawable.images,
            R.drawable.images,R.drawable.images,
    };
}