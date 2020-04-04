package com.example.todaydemo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.yoyozhangh.github.refresh.GodRefreshLayout;

public class MainActivity extends AppCompatActivity {

    private GodRefreshLayout godRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        godRefreshLayout = findViewById(R.id.refresh);
        godRefreshLayout.setRefreshManager();
    }
}
