package com.example.junaideath.fashionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Timer;
import java.util.TimerTask;

public class HomeScreen extends AppCompatActivity {

    ImageButton tshirtBtn, jeansBtn, vestBtn, pamelahatBtn, beltBtn, ponchoBtn, wcoatBtn, socksBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);

        tshirtBtn = (ImageButton) findViewById(R.id.tshirtBtn);
        jeansBtn =  (ImageButton)findViewById(R.id.jeansBtn);
        vestBtn =  (ImageButton)findViewById(R.id.vestBtn);
        pamelahatBtn =  (ImageButton)findViewById(R.id.phatBtn);
        beltBtn =  (ImageButton)findViewById(R.id.beltBtn);
        ponchoBtn =  (ImageButton)findViewById(R.id.ponchoBtn);
        wcoatBtn =  (ImageButton)findViewById(R.id.wcoatBtn);
        socksBtn = (ImageButton) findViewById(R.id.socksBtn);

        tshirtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeScreen.this, DetailScreen.class);
                startActivity(intent);
            }
        });
        jeansBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeScreen.this, DetailScreen2.class);
                startActivity(intent);
            }
        });
        vestBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeScreen.this, DetailScreen3.class);
                startActivity(intent);
            }
        });
        pamelahatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeScreen.this, DetailScreen4.class);
                startActivity(intent);
            }
        });
        beltBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeScreen.this, DetailScreen5.class);
                startActivity(intent);
            }
        });
        ponchoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeScreen.this, DetailScreen6.class);
                startActivity(intent);
            }
        });
        wcoatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeScreen.this, DetailScreen7.class);
                startActivity(intent);
            }
        });
        socksBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeScreen.this, DetailScreen8.class);
                startActivity(intent);
            }
        });


    }
}
