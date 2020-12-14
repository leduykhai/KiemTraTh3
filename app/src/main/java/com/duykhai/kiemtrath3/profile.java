package com.duykhai.kiemtrath3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class profile extends AppCompatActivity {
Button btquaylai_417;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        btquaylai_417 = findViewById(R.id.btquaylai_417);

        btquaylai_417.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotologin = new Intent(profile.this, TaiKhoan.class);
                startActivity(gotologin);
            }
        });
    }
}