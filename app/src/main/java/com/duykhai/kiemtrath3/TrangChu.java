package com.duykhai.kiemtrath3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class TrangChu extends AppCompatActivity {
    TextView chonthietbi_417;
    ViewFlipper viewFlipper_417;
    GridView gridView_417;
    ImageView eshop_417;

    String[] title_grid = {" Máy lạnh DAIKIN " +
            " FFA35RV1V " +
            " 9.700.000VNĐ", " Máy lọc khí DAIKIN " +
            " Hatari HT " +
            " 10.300.000VNĐ", " Máy lạnh DAIKIN " +
            " Inverter " +
            " 19.700.000VNĐ"," Điều hòa đứng DAIKIN " +
            " FFA35RV1V " +
            " 7.700.000VNĐ"," Máy lạnh DAIKIN " +
            " HM912EC-N " +
            " 6.700.000VNĐ"," Máy âm trần DAIKIN " +
            " FFA35RV1V " +
            " 8.000.000VNĐ",};
    int[] img_grid = {R.drawable.dieuhoa, R.drawable.km1, R.drawable.km2,R.drawable.km3,
            R.drawable.km4, R.drawable.km1};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_chu);

        eshop_417 = findViewById(R.id.eshop_417);
        chonthietbi_417 = findViewById(R.id.chonthietbi_417);

        gridView_417 = findViewById(R.id.grid_417);
        GridViewAdapter gridViewAdapter_417 = new GridViewAdapter(this,title_grid,img_grid);
        gridView_417.setAdapter(gridViewAdapter_417);

        int[] image_417 = {R.drawable.km1, R.drawable.km2, R.drawable.km3, R.drawable.km4};
        viewFlipper_417 = findViewById(R.id.filip_417);

        //vong lap
        for(int Image_417: image_417){
            flipperImage(Image_417);
        }

        eshop_417.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotologin = new Intent(TrangChu.this, Detail.class);
                startActivity(gotologin);
            }
        });

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav_417);
        bottomNavigationView.setSelectedItemId(R.id.trangchu_417);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.trangchu_417:
                        return true;
                    case R.id.donhang_417:
                        startActivity(new Intent(getApplicationContext(), DonHang.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.thietbi_417:
                        startActivity(new Intent(getApplicationContext(), ThietBi.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.thongbao_417:
                        startActivity(new Intent(getApplicationContext(), ThongBao.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.taikhoan_417:
                        startActivity(new Intent(getApplicationContext(), TaiKhoan.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
    public void flipperImage(int image_417){
        ImageView imageView_417 = new ImageView(this);
        imageView_417.setBackgroundResource(image_417);
        viewFlipper_417.addView(imageView_417);
        viewFlipper_417.setFlipInterval(2500);
        viewFlipper_417.setAutoStart(true);
        viewFlipper_417.setInAnimation(this, android.R.anim.slide_in_left);
    }
}