package com.example.junaideath.fashionapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class DetailScreen2 extends AppCompatActivity {

    Button btn_order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_screen2);

        btn_order = (Button)findViewById(R.id.btn_order);

        btn_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailScreen2.this, SuccessScreen.class);
                startActivity(intent);
            }
        });

    }
}
