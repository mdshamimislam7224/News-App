package com.mdshamimislam.newsapp.activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.mdshamimislam.newsapp.R;
import com.mdshamimislam.newsapp.adapter.CountryNameAndImageAdpter;
import com.mdshamimislam.newsapp.adapter.PagerAdapter;
import com.mdshamimislam.newsapp.modelClass.Country_name_and_Image;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    TabItem mhome,mscience,msports,mhealth;
    PagerAdapter pagerAdapter;
    ViewPager viewPager;
    private CountryNameAndImageAdpter countryNameAndImageAdpter;
    Toolbar relativeLayouttoolbar;
    String api="6aa3145222c144269c435d12706c8469";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mhome=findViewById(R.id.home);
        mscience=findViewById(R.id.science);
        msports=findViewById(R.id.sports);
        mhealth=findViewById(R.id.health);
        viewPager=findViewById(R.id.fragmentContainer);
        tabLayout =findViewById(R.id.include);
        chooseCountry();

        }




    void  chooseCountry()
    {
        final AlertDialog.Builder alert= new AlertDialog.Builder(MainActivity.this);
        View view=getLayoutInflater().inflate(R.layout.spinner_dailog_layout,null);
        final Spinner spinner=(Spinner)view.findViewById(R.id.spinner);
        final Button cancel=(Button) view.findViewById(R.id.countryCancelBtn);
        final Button submit=(Button) view.findViewById(R.id.countryOkBtn);
        alert.setView(view);

        final AlertDialog alertDialog = alert.create();
         alertDialog.setCanceledOnTouchOutside(false);
         alertDialog.show();
        countryNameAndImageAdpter = new CountryNameAndImageAdpter(MainActivity.this, Country_name_and_Image.getCountryAndImage());
        spinner.setAdapter(countryNameAndImageAdpter);


         submit.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view)
             {

                 int i = spinner.getSelectedItemPosition();
                 Toast.makeText(MainActivity.this, "spinnerVlaue="+i, Toast.LENGTH_SHORT).show();

                 if (i == 0) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","au");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Australia", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 } else if (i == 1) {

                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","ar");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Argentina", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 } else if (i == 2) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","at");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Austria", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 }

                 else if (i == 3) {

                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","bd");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Bangladesh", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 } else if (i == 4) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","br");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Brazil", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 }
                 else if (i == 5) {

                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","be");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Belgium", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();

                 } else if (i == 6) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","bg");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Bulgaria", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();

                 }
                 else if (i == 7) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","ca");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected CANADA", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();

                 } else if (i == 8) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","cn");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected China", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 }
                 else if (i == 9) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","cu");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Cuba", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();

                 } else if (i == 10) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","cz");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Czechia", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 }
                 else if (i == 11) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","co");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Colombia", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();

                 } else if (i == 12) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","eg");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Egypt", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 }
                 else if (i == 13) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","fr");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected France", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();

                 } else if (i == 14) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","gr");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Greece", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 }
                 else if (i == 15) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","de");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Germany", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 } else if (i == 16) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","hk");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Hong Kong", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 }
                 else if (i == 17) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","hu");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Hungary", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 } else if (i == 18) {

                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","id");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Indonesia", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 }
                 else if (i == 19) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","ie");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Ireland", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 } else if (i == 20) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","il");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Israel", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 }
                 else if (i == 21) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","in");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected India", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();

                 } else if (i == 22) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","it");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Italy", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 }
                 else if (i == 23) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","jp");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Japan", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 } else if (i == 24) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","kr");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Korea", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 }
                 else if (i == 25) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","lt");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Lithuania", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();

                 } else if (i == 26) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","lv");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Latvia", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 }else if (i == 27) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","ma");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Morocco", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 } else if (i == 28) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","mx");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Mexico", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 }else if (i == 29) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","my");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Malaysia", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 } else if (i == 30) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","ng");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Nigeria", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 }else if (i == 31) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","nl");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Netherlands", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();

                 } else if (i == 32) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","no");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Norway", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 }else if (i == 33) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","nz");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected New Zealand", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();

                 } else if (i == 34) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","ph");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Philippine", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 }
                 else if (i == 35) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","pl");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Poland", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();

                 } else if (i == 36) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","pt");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Portugal", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 }
                 else if (i == 37) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","ro");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Romania", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();

                 } else if (i == 38) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","ru");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Russia", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 }
                 else if (i == 39) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","ch");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Switzerland", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();

                 } else if (i == 40) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","rs");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Serbia", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 }
                 else if (i == 41) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","sa");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Saudi Arabia", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();

                 } else if (i == 42) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","sg");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Singapore", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 }
                 else if (i == 43) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","za");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected South Africa", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();

                 } else if (i == 44) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","se");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Sweden", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 }
                 else if (i == 45) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","si");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Slovenia", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();

                 } else if (i == 46) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","sk");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Slovakia", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 }
                 else if (i == 47) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","th");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Thailand", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 } else if (i == 48) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","tr");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Turkey", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 }
                 else if (i == 49) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","tw");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Taiwan", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 } else if (i == 50) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","gb");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected United Kingdom", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 }
                 else if (i == 51) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","ua");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Ukraine", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 }
                 else if (i == 52) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","us");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected United State of America", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 }
                 else if (i == 53) {
                     SharedPreferences sharedPreference = getSharedPreferences("countryName", Context.MODE_PRIVATE);
                     SharedPreferences.Editor editor=sharedPreference.edit();
                     editor.putString("country","ve");
                     editor.apply();
                     Toast.makeText(MainActivity.this, "Selected Venezuela", Toast.LENGTH_SHORT).show();
                     alertDialog.dismiss();
                 }

                 else {
                     Toast.makeText(MainActivity.this, "Invalid Search", Toast.LENGTH_SHORT).show();
                 }




                 pagerAdapter= new PagerAdapter(getSupportFragmentManager(),8);
                 viewPager.setAdapter(pagerAdapter);

                 tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                     @Override
                     public void onTabSelected(TabLayout.Tab tab)
                     {
                         viewPager.setCurrentItem(tab.getPosition());
                         if (tab.getPosition()==0 || tab.getPosition()==1 || tab.getPosition()==2
                                 || tab.getPosition()==3 || tab.getPosition()==4 || tab.getPosition()==5 ||
                         tab.getPosition()==6 || tab.getPosition()==7)
                         {
                             pagerAdapter.notifyDataSetChanged();
                         }
                     }

                     @Override
                     public void onTabUnselected(TabLayout.Tab tab)
                     {

                     }

                     @Override
                     public void onTabReselected(TabLayout.Tab tab)
                     {

                     }
                 });

                 viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));


             }
         });

         cancel.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 alertDialog.dismiss();
             }
         });


    }



}
