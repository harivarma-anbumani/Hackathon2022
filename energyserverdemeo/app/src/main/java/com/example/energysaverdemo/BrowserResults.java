package com.example.energysaverdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class BrowserResults extends AppCompatActivity {

    ImageView forwardImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser_results);


        forwardImage = findViewById(R.id.imageView88);
        forwardImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BrowserResults.this, Lightsoff.class);
                startActivity(intent);
                finish();
            }
        });

    }
}