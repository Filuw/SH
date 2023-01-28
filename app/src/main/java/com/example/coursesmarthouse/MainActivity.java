package com.example.coursesmarthouse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.coursesmarthouse.databinding.ActivityMainBinding;
import com.example.coursesmarthouse.ui.main.SectionsPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;

        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = binding.tabs;
        tabs.setupWithViewPager(viewPager);
    }


    public void startAddActivity(View v) {
        Intent intent=new Intent(MainActivity.this, AddActivity.class);
        startActivity(intent);
    }

    public void startKitchenActivity(View v) {
        Intent intent=new Intent(MainActivity.this, KitchenActivity.class);
        startActivity(intent);
    }


    public void startNewActivity(View v) {
        finish();
    }
}