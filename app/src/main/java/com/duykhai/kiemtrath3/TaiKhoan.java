package com.duykhai.kiemtrath3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

import adapter.TaikhoanAdapter;
import model.Contact;

public class TaiKhoan extends AppCompatActivity {
    private ListView listView_417;
    Button Dx_417,Hs_417;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tai_khoan);

        Dx_417 = findViewById(R.id.btlogin_417);
        Hs_417 = findViewById(R.id.bthoso_417);

        listView_417 = findViewById(R.id.list_hoso_417);
        ArrayList<Contact> arrayList0 = new ArrayList<>();
        Contact contact0 = new Contact(R.drawable.ic_hoso," Duy Khai" +
                " 1811505310417");

        arrayList0.add(contact0);
        TaikhoanAdapter  taikhoanAdapter0= new TaikhoanAdapter(this, R.layout.row_item_hoso, arrayList0);
        listView_417.setAdapter(taikhoanAdapter0);

        Dx_417.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotologin = new Intent(TaiKhoan.this, Login.class);
                startActivity(gotologin);
            }
        });
        Hs_417.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotologin = new Intent(TaiKhoan.this, profile.class);
                startActivity(gotologin);
            }
        });

        listView_417 = findViewById(R.id.list_taikhoan_417);
        ArrayList<Contact> arrayList = new ArrayList<>();
        Contact contact = new Contact(R.drawable.ic_caidat,"Cài đặt");
        Contact contact_1 = new Contact(R.drawable.ic_help,"Câu hỏi thường gặp");
        Contact contact_2 = new Contact(R.drawable.ic_phanhoi_taikhoan,"Gửi phản hồi");
        Contact contact_3 = new Contact(R.drawable.ic_tttrogiup,"Trung tâm hỗ trợ");
        Contact contact_4 = new Contact(R.drawable.ic_tthotro,"Thông tin hỗ trợ");

        arrayList.add(contact);
        arrayList.add(contact_1);
        arrayList.add(contact_2);
        arrayList.add(contact_3);
        arrayList.add(contact_4);

        listView_417.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i_417 = new Intent(TaiKhoan.this, GuiPhanHoi.class);
                i_417.putExtra("Gửi phản hồi", listView_417.getItemAtPosition(2).toString());
                startActivity(i_417);
            }
        });

        TaikhoanAdapter  taikhoanAdapter= new TaikhoanAdapter(this, R.layout.row_item_taikhoan, arrayList);
        listView_417.setAdapter(taikhoanAdapter);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav_417);
        bottomNavigationView.setSelectedItemId(R.id.taikhoan_417);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.trangchu_417:
                        startActivity(new Intent(getApplicationContext(), TrangChu.class));
                        overridePendingTransition(0,0);
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
                        return true;
                }
                return false;
            }
        });
    }
}

