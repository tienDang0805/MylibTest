package com.examplesdk.mylibtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.examplesdk.mathutils.MathUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MathUtils.simpleToast(this,"hii");
    }
}