package com.mdshamimislam.newsapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mdshamimislam.newsapp.R;
import com.mdshamimislam.newsapp.modelClass.CountryNameImage;

import java.util.List;

public class CountryNameAndImageAdpter extends BaseAdapter
{
    private Context context;
    private List<CountryNameImage> countryNameImages;

    public CountryNameAndImageAdpter(Context context, List<CountryNameImage> countryNameImages) {
        this.context = context;
        this.countryNameImages = countryNameImages;
    }



    @Override
    public int getCount() {
        return countryNameImages !=null? countryNameImages.size():0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View rootView = LayoutInflater.from(context)
                .inflate(R.layout.country_name_image_signle_layout,viewGroup,false);

        TextView txtname =rootView.findViewById(R.id.countryName);
        ImageView image =rootView.findViewById(R.id.countryImage);

        txtname.setText(countryNameImages.get(i).getCountryName());
        image.setImageResource(countryNameImages.get(i).getCountryImage());


        return rootView;
    }
}
