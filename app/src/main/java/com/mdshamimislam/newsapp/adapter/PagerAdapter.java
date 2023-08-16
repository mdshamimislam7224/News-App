package com.mdshamimislam.newsapp.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.mdshamimislam.newsapp.fragment.Business_Fragment;
import com.mdshamimislam.newsapp.fragment.Entertainment_Fragment;
import com.mdshamimislam.newsapp.fragment.General_Fragment;
import com.mdshamimislam.newsapp.fragment.Health_Fragment;
import com.mdshamimislam.newsapp.fragment.Home_Fragment;
import com.mdshamimislam.newsapp.fragment.Science_Fragment;
import com.mdshamimislam.newsapp.fragment.Sports_Fragment;
import com.mdshamimislam.newsapp.fragment.Technology_Fragment;

public class PagerAdapter extends FragmentPagerAdapter {
    int tabCoount;

    public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabCoount=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new Home_Fragment();
            case 1:
                return new Sports_Fragment();
            case 2:
                return new Health_Fragment();
            case 3:
                return new General_Fragment();
            case 4:
                return new Business_Fragment();
            case 5:
                return new Entertainment_Fragment();
            case 6:
                return new Science_Fragment();
            case 7:
                return new Technology_Fragment();

            default:
                return null;


        }
    }

    @Override
    public int getCount() {
        return tabCoount;
    }
}
