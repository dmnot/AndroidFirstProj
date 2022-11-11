package com.example.androidfirstproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.RadioButton;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

public class calculator extends AppCompatActivity {
     String CALCULATOR_ACTIVITY = "CALCULATOR_ACTIVITY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        Button  calculate = (Button) findViewById(R.id.calc);
        calculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                calculateAnswer();
               /* Intent i = new Intent(calculator.this, MainActivity.class);
                startActivity(i);*/

            }
        });
        //calculate.setOnClickListener(view -> calculateAnswer() );


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
        String num1 = numOne.getText().toString();
        String num2 = numTwo.getText().toString();
        if (!num1.equals("") && num1!=null){
            numone = Integer.parseInt(numOne.getText().toString());
        }
        if (!num2.equals("") && num2!=null){
            numtwo = Integer.parseInt(numTwo.getText().toString());
        }
        try {
            int a = 25/0;
        }catch (ArithmeticException e ){
            e.printStackTrace();
        }

        if (add.isChecked()) {
            Log.d(CALCULATOR_ACTIVITY, "Operation is add");
            solution = numone + numtwo;
        }
        if (sub.isChecked()) {
            Log.d(CALCULATOR_ACTIVITY, "Operation is sub");
            solution = numone - numtwo;
        }
        if (mul.isChecked()) {
            Log.d(CALCULATOR_ACTIVITY, "Operation is multiply");
            solution = numone * numtwo;
        }
        if (div.isChecked()) {
            Log.d(CALCULATOR_ACTIVITY, "Operation is divide");
            solution = numone / numtwo;
        }
        answer.setText(String.valueOf(solution));
        Log.d(CALCULATOR_ACTIVITY, "Result:" + solution);
    }
   /* //Context training
    TextView textView = new TextView(this);
    ListAdapter adapter = new SimpleCursorAdapter(getApplicationContext(),);
    //------------------------------
    //Доступ из класса Activity -- Наследник класса Context
    getSystemService(LAYOUT_INFLATER_SERVICE);

    SharedPreferences prefs = getApplicationContext().getSharedPreferences("Prefs",NODE_PREFERENCE);*/

    //Intent
}