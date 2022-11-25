package com.example.energysaverdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoAnimation extends AppCompatActivity {
    ImageView imageViewAnimFwd;
    VideoView videov;
    Button clk;
    MediaController mediac;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_animation);

        imageViewAnimFwd = findViewById(R.id.imageViewAnimFwd);
        imageViewAnimFwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VideoAnimation.this,EndSaveElectricity.class);
                startActivity(intent);
                finish();
            }
        });

//        videov = (VideoView) findViewById(R.id.videov);
//        clk = (Button) findViewById(R.id.clk);
//        mediac = new MediaController(this);

    }

    public void videoplay(View view){
        String videopath = "android.resource://com.example.energysaverdemo"+R.raw.saveupvtwo;
        Uri uri = Uri.parse(videopath);
        videov.setVideoURI(uri);
        videov.setMediaController(mediac);
        mediac.setAnchorView(videov);
        videov.start();
    }
}