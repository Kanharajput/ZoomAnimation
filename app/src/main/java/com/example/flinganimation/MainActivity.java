package com.example.flinganimation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FlingAnimation;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.imageView);

    }

    public void moveThisItem(View view) {
    FlingAnimation fling = new FlingAnimation(view, DynamicAnimation.SCROLL_Y);
    fling.setStartVelocity(700f)
            .setFriction(2.1f)
            .setMaxValue(600f)         //after this value it will stop the motion lets say at every click it move 100f then after 6 times it will stop
            .start();
    }

    public void openZoomActivty(View view) {
        Intent intent = new Intent(this,ZoomActivity.class);
        startActivity(intent);
    }
}