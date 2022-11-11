package com.example.androidfirstproj;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class ToinfActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toinf);
         TextView tv = (TextView) findViewById(R.id.tv);
        String str = getIntent().getStringExtra("et");
        tv.setText(str);
    }
}