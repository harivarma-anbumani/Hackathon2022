package com.example.energysaverdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class StepOne extends AppCompatActivity {
    Button btnBackStepOne;
    ImageView imageViewAnimFwd;
    ImageView imageViewOffButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step_one);


//        imageViewStepOne.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(StepOne.this,StepTwo.class);
//                startActivity(intent);
//                finish();
//            }
//        });

        imageViewOffButton = findViewById(R.id.imageViewOffButtonClick);
        imageViewAnimFwd = findViewById(R.id.imageViewAnimFwd);
        imageViewAnimFwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StepOne.this,VideoAnimation.class);
                startActivity(intent);
                finish();
            }
        });

        imageViewOffButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StepOne.this, Lightsoff.class);
                startActivity(intent);
                finish();
            }
        });
    }
}