package com.example.energysaverdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class EndSaveElectricity extends AppCompatActivity {
    ImageView imageViewCongratsHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_save_electricity);

        imageViewCongratsHome = findViewById(R.id.imageViewCongratsHome);

        imageViewCongratsHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EndSaveElectricity.this, Dashboard.class);
                startActivity(intent);
                finish();
            }
        });
    }
}