package com.example.doctor;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class Tabbed extends AppCompatActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabbed);



        tabLayout=(TabLayout) findViewById(R.id.tablayout_id);
        appBarLayout=(AppBarLayout) findViewById(R.id.appbarid);
        viewPager=(ViewPager)findViewById(R.id.viewpager_id);

        //Adding Fragment
        ViewPagerAdapter adapter=new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new current(),"Current");
        adapter.AddFragment(new pendding(),"Pending");
        adapter.AddFragment(new previous(),"Previous");

        //Adapter Setup
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}