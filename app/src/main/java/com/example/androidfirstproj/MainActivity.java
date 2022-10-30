package com.example.androidfirstproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);


        //Text for app
        TextView textView = new TextView(this);
        textView.setText("Hi Android");
        textView.setTextSize(22);
        //---------------------------------------
        setContentView(textView);

    }


}