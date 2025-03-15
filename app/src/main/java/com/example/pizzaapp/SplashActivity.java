package com.example.pizzaapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        ImageView logo = findViewById(R.id.logoImage);
        TextView headline = findViewById(R.id.appTitle);
        TextView subheadline = findViewById(R.id.appSlogan);


        Animation fadeIn = new AlphaAnimation(0, 1);
        fadeIn.setDuration(1500);
        logo.startAnimation(fadeIn);
        headline.startAnimation(fadeIn);
        subheadline.startAnimation(fadeIn);


        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this, ListPizzaActivity.class);
            startActivity(intent);
            finish();
        }, 5000);
    }
}
