package com.example.androidfirstproj;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private static final  int REQ_C = 1;
    EditText et ;
    private TextView tv;
    ActivityResultLauncher<Intent> mStartActivityForResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    Intent intent = result.getData(); // Интент лежащий внутри
                    tv.setText(intent.getStringExtra("tv"));
                }
            }

    );
    //private TextView tv = (TextView) findViewById(R.id.Tv);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        et = (EditText) findViewById(R.id.et);
        Button btn = (Button) findViewById(R.id.button40);
        Button btn1 = (Button) findViewById(R.id.button41);
        Button btn2 = (Button) findViewById(R.id.button42);
        btn.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
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
    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.button40:
                i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
                break;
            case R.id.button41:
                i = new Intent(MainActivity.this, ToinfActivity.class);
                String eText = et.getText().toString();
                i.putExtra("et", eText);
                startActivity(i);
                break;
            case R.id.button42:
                i = new Intent(MainActivity.this, ComeBackActivity.class);
                mStartActivityForResult.launch(i);
                break;
        }
    }



    /*@Override
    public boolean onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case RESULT_OK:
                tv.setText(data.getStringExtra("et"));

        }
        return false;
    }*/
}