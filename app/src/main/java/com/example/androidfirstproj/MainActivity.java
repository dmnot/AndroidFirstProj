package com.example.androidfirstproj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

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
        //-------------------------------
        //ConstraintLayout
        ConstraintLayout constraintLayout = new ConstraintLayout(this);
        //--------------------------------
        //Params for ConstraintLayout
        //Размер контейнера в зависимости от положенного внутрь контента
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT);
        //------------------------------------------------------------------
        // Позиционирование текста по центру
        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;
        //----------------------------------------------------------------
        textView.setLayoutParams(layoutParams); //Применение параметров к тексту
        constraintLayout.addView(textView); //Закидывание внутрь ConstraintLayout'a TextView
        //---------------------------------------
        setContentView(constraintLayout);

    }


}