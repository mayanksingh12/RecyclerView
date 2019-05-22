package com.example.recyclerview2;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Toolbar toolbar;
    ViewPager viewPager;
    TabLayout tabLayout;
    TabItem tabItem1;
    TabItem tabItem2;
    TabItem tabItem3;
    Page_Adapter pagerAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        setSupportActionBar(toolbar);

        tabLayout=findViewById(R.id.tabLayout);
        tabItem1=findViewById(R.id.name);
        tabItem2=findViewById(R.id.chat);
        tabItem3=findViewById(R.id.Stat);
        viewPager=findViewById(R.id.viewpager);


         pagerAdapter=new Page_Adapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
  viewPager.setCurrentItem(tab.getPosition());

      if(tab.getPosition()==1)
      {
          tabLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.colorAccent));
          toolbar.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.colorPrimary));
      }
      else if (tab.getPosition()==2){

          tabLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this,android.R.color.darker_gray));
          toolbar.setBackgroundColor(ContextCompat.getColor(MainActivity.this,android.R.color.darker_gray));

      }

      else
      {
          tabLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.colorPrimary));
          toolbar.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.colorPrimary));
      }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }






}
