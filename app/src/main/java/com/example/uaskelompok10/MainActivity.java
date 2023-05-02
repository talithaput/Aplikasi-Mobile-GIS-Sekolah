package com.example.uaskelompok10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        check();
        Button btnSMA1 = (Button) findViewById(R.id.btnSMA1);
        Button btnSMA2 = (Button) findViewById(R.id.btnSMA2);
        Button btnSMP1 = (Button) findViewById(R.id.btnSMP1);
        Button btnSMP2 = (Button) findViewById(R.id.btnSMP2);
        Button btnSD4 = (Button) findViewById(R.id.btnSD4);
        Button btnSD8 = (Button) findViewById(R.id.btnSD8);
        Button btnTK1 = (Button) findViewById(R.id.btnTK1);
        btnSMA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( MainActivity.this,LokasiSMA1.class);
                startActivity(i);
            }
        });
        btnSMA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( MainActivity.this,LokasiSMA2.class);
                startActivity(i);
            }
        });
        btnSMP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( MainActivity.this,LokasiSMP1.class);
                startActivity(i);
            }
        });
        btnSMP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( MainActivity.this,LokasiSMP2.class);
                startActivity(i);
            }
        });
        btnSD4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( MainActivity.this,LokasiSD4.class);
                startActivity(i);
            }
        });
        btnSD8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( MainActivity.this,LokasiSD8.class);
                startActivity(i);
            }
        });
        btnTK1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( MainActivity.this,LokasiTK1.class);
                startActivity(i);
            }
        });
    }
    private void check(){
        String[] permission = {
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_COARSE_LOCATION

        };
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M &&
        checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION)
        != PackageManager.PERMISSION_GRANTED &&
        checkSelfPermission(Manifest.permission.ACCESS_COARSE_LOCATION)
        != PackageManager.PERMISSION_GRANTED){
            requestPermissions(permission, 1234);
        }
    }
}