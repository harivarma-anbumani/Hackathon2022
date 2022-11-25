package com.example.energysaverdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import pl.droidsonroids.gif.GifImageView;

public class Dashboard extends AppCompatActivity {
    ImageView imageViewEnergy;
    ImageView imageViewSaveWater;
    private MediaPlayer mediaPlayer;
    GifImageView gifImageViewLight;
    GifImageView gifImageViewSaveWater;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        imageViewEnergy = findViewById(R.id.imageViewEnergy);
        imageViewSaveWater = findViewById(R.id.imageViewSaveWater);
        gifImageViewLight = findViewById(R.id.gifImageViewLight);
        gifImageViewSaveWater = findViewById(R.id.gifImageViewSaveWater);

        Intent intent = getIntent();


        imageViewEnergy.setOnClickListener(view -> {
            Intent intent1 = new Intent(Dashboard.this,StepOne.class);
            startActivity(intent1);
            finish();
        });

        imageViewSaveWater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this,StepOne.class);
                startActivity(intent);
                finish();
            }
        });

        gifImageViewLight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Dashboard.this,StepOne.class);
                startActivity(intent1);
                finish();
            }
        });

        gifImageViewSaveWater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Dashboard.this,StepOne.class);
                startActivity(intent1);
                finish();
            }
        });

        // Media player

        mediaPlayer = MediaPlayer.create(Dashboard.this,R.raw.backgroundmusic);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
    }
    @Override
    protected void onResume() {
        super.onResume();
        mediaPlayer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mediaPlayer.pause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mediaPlayer.start();
//        mediaPlayer.stop();
//        mediaPlayer.release();
    }
}