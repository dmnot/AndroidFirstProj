package com.example.androidfirstproj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //-----------------------------------------------------
       /* TextView normal = (TextView) findViewById(R.id.normal);
        TextView bold = (TextView) findViewById(R.id.bold);
        TextView italic = (TextView) findViewById(R.id.italic);
        //-----------------------------------------------------
        normal.setText("Text from java file");
        normal.setTextColor(Color.RED);*/
      /*  TextView textView = (TextView) findViewById(R.id.header); // Поиск элементп
        // и преобразование в textView
        textView.setText("Hi from MainActivity.java file"); // Установка другого текста*/
        //Text for app
       /* TextView textView = new TextView(this);
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
        setContentView(constraintLayout);*/

    }


}