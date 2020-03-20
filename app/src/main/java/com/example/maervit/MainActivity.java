package com.example.maervit;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import me.dm7.barcodescanner.zxing.ZXingScannerView;


public class MainActivity extends AppCompatActivity {

    boolean shouldStart =true;

    // VARIABLES
    Animation topAnimation;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        Handler handler = new Handler();
        handler.postDelayed(run,1410);

        topAnimation = AnimationUtils.loadAnimation(this, R.anim.top_animation);

        //image

        image = findViewById(R.id.imageView2);
        image.setAnimation(topAnimation);

    }

    Runnable run = new Runnable() {
        @Override
        public void run() {
            if(shouldStart = true) {
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                MainActivity.this.startActivity(intent);
                MainActivity.this.finish();
            }
        }
    };

    @Override
    protected void onPause() {
        shouldStart = false;
        super.onPause();
        this.finish();
    }
}




