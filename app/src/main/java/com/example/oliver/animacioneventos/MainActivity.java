package com.example.oliver.animacioneventos;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private RelativeLayout canvas;
    Button button,button1,button2,button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.faceIcon);
        canvas = (RelativeLayout) findViewById(R.id.animationCanvas);

    }

    public void onButtonClick(View v) {

        int screenHeight = canvas.getHeight();
        int targetY = screenHeight - imageView.getBottom();

        ObjectAnimator animator = ObjectAnimator.ofFloat(
                imageView, "y", 1200, targetY)
                .setDuration(3000);
        animator.setInterpolator(new BounceInterpolator());
        animator.start();
    }

    public void onButtonClick2(View v) {

        int screenHeight = canvas.getHeight();
        int targetY = screenHeight - imageView.getBottom();

        ObjectAnimator animator = ObjectAnimator.ofFloat(
                imageView, "y", 1200, targetY)
                .setDuration(3000);
        animator.setInterpolator(new DecelerateInterpolator(3));
        animator.start();
    }

    public void onButtonClick3(View v) {

        int screenHeight = canvas.getHeight();
        int targetY = screenHeight - imageView.getBottom();

        ObjectAnimator animator = ObjectAnimator.ofFloat(
                imageView, "y", 700, targetY)
                .setDuration(3000);
        animator.setInterpolator(new CycleInterpolator(2));
        animator.start();
    }

    public void onButtonClick4(View v) {

        int screenHeight = canvas.getHeight();
        int targetY = screenHeight - imageView.getBottom();

        ObjectAnimator animator = ObjectAnimator.ofFloat(
                imageView, "y", 800, targetY)
                .setDuration(3000);
        animator.setInterpolator(new AccelerateInterpolator(4));
        animator.start();
    }

}
