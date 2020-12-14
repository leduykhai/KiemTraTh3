package com.duykhai.kiemtrath3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {
    Button bt_417;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        bt_417 = findViewById(R.id.btlogin_417);
        bt_417.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i_417= new Intent(Login.this, TrangChu.class);
                startActivity(i_417);
            }
        });
    }
}