package com.jay.fragmentdemo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

@SuppressLint("ValidFragment")
public class newFragment extends Fragment{
    private int picture;

    public newFragment(int picture) {
        this.picture = picture;
    }


    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.bg_picture,container,false);
        ImageView iv_picture=view.findViewById(R.id.iv_picture);
        iv_picture.setBackgroundResource(picture);
        return view;
    }
}
