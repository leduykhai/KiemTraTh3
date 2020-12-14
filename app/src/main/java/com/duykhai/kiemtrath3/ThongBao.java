package com.duykhai.kiemtrath3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ThongBao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_bao);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav_417);
        bottomNavigationView.setSelectedItemId(R.id.thongbao_417);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.trangchu_417:
                        startActivity(new Intent(getApplicationContext(), TrangChu.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.donhang_417:
                        startActivity(new Intent(getApplicationContext(), DonHang.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.thietbi_417:
                        startActivity(new Intent(getApplicationContext(), ThietBi.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.thongbao_417:
                        return true;
                    case R.id.taikhoan_417:
                        startActivity(new Intent(getApplicationContext(), TaiKhoan.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });
    }
}