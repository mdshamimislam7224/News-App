package com.mdshamimislam.newsapp.fragment;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.mdshamimislam.newsapp.R;
import com.mdshamimislam.newsapp.adapter.Adapter;
import com.mdshamimislam.newsapp.modelClass.Constant;
import com.mdshamimislam.newsapp.modelClass.ModelClass;
import com.mdshamimislam.newsapp.modelClass.mainNews;
import com.mdshamimislam.newsapp.utilites.ApiUtilities;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Home_Fragment extends Fragment {
    ArrayList<ModelClass> modelClassArrayList;
    Adapter adapter;
   private SharedPreferences sharedPreferences;
    private String countryName;
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view=  inflater.inflate(R.layout.fragment_home,  null);

      sharedPreferences = getContext().getSharedPreferences("countryName", Context.MODE_PRIVATE);
        countryName=sharedPreferences.getString("country","");


      recyclerView=view.findViewById(R.id.recyclerviewHome);
      modelClassArrayList= new ArrayList<>();
      recyclerView.setLayoutManager(new LinearLayoutManager((getContext())));
      adapter= new Adapter(getContext(),modelClassArrayList);
      recyclerView.setAdapter(adapter);

      findNews();


      return view;
    }

    private void findNews()
    {
        ApiUtilities.getApiInterface().getNews(countryName,100, Constant.newsApiKEy).enqueue(new Callback<mainNews>() {
            @Override
            public void onResponse(Call<mainNews> call, Response<mainNews> response) {
              if (response.isSuccessful() )
                {
                    modelClassArrayList.addAll(response.body().getArticles());
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<mainNews> call, Throwable t) {

            }
        });
    }
}