package com.example.smarthouse;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.smarthouse.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private ImageView mImage;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mImage = binding.imageView;

        ImageView img = findViewById(R.id.imageView);
        img.setImageResource(R.drawable.logo);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.animation);
        img.startAnimation(animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(i);
                finish();
            }
        }, 2200);
    }
}