package com.example.androidfirstproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.RadioButton;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

public class calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        final Button  calculate = (Button) findViewById(R.id.calc);
        calculate.setOnClickListener(view -> calculateAnswer());
    }

    private void calculateAnswer() {
        EditText numOne  = (EditText) findViewById(R.id.editTextNumberDecimal);
        EditText numTwo  = (EditText) findViewById(R.id.editTextNumberDecimal2);

        RadioButton add = (RadioButton) findViewById(R.id.add);
        RadioButton sub = (RadioButton) findViewById(R.id.substract);
        RadioButton mul = (RadioButton) findViewById(R.id.multiple);
        RadioButton div = (RadioButton) findViewById(R.id.divide);

        TextView answer = (TextView) findViewById(R.id.result);

        float numone = Integer.parseInt(numOne.getText().toString());
        float numtwo = Integer.parseInt(numTwo.getText().toString());

        float solution = 0;

        if (add.isChecked()) {
            solution = numone + numtwo;
        }
        if (sub.isChecked()) {
            solution = numone - numtwo;
        }
        if (mul.isChecked()) {
            solution = numone * numtwo;
        }
        if (div.isChecked()) {
            solution = numone / numtwo;
        }
        answer.setText(String.valueOf(solution));
    }
    //Context training
    TextView textView = new TextView(this);
    ListAdapter adapter = new SimpleCursorAdapter(getApplicationContext(),);
    //------------------------------
    //Доступ из класса Activity -- Наследник класса Context
    getSystemService(LAYOUT_INFLATER_SERVICE);

    SharedPreferences prefs = getApplicationContext().getSharedPreferences("Prefs",NODE_PREFERENCE);
}