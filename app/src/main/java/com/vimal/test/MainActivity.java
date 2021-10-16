package com.vimal.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.vimal.toast.ToastVimal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToastVimal.showToastMessage(MainActivity.this,"Test");
    }
}