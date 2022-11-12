package com.mehboob.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etNum1, etNum2;
    private TextView txtAnswer;
    private Button btnPlus, btnMinus, btnMultiply, btnDivide, btnMod, btnEqual;

    private double answer;
     private static final String TAG= "MainActivity";
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Edit texts

        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);
        //TextView

        txtAnswer = findViewById(R.id.txtAnswer);

        //Buttons
        btnDivide = findViewById(R.id.btnDivide);
        btnEqual = findViewById(R.id.btnEqual);
        btnMod = findViewById(R.id.btnMod);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnMinus = findViewById(R.id.btnMinus);
        btnPlus = findViewById(R.id.btnPlus);


        btnPlus.setOnClickListener(view -> {
           if (checkValidation()){

            double num1=   Double.parseDouble(etNum1.getText().toString());
            double num2=   Double.parseDouble(etNum2.getText().toString());
            answer=num1+num2;
           }
        });
        btnMinus.setOnClickListener(view -> {

            if (checkValidation()){

                double num1=   Double.parseDouble(etNum1.getText().toString());
                double num2=   Double.parseDouble(etNum2.getText().toString());
                answer=num1-num2;
            }
        });

        btnMultiply.setOnClickListener(view -> {

            if (checkValidation()){

                double num1=   Double.parseDouble(etNum1.getText().toString());
                double num2=   Double.parseDouble(etNum2.getText().toString());
                answer=num1*num2;
            }
        });

        btnMod.setOnClickListener(view -> {
            if (checkValidation()){

                double num1=   Double.parseDouble(etNum1.getText().toString());
                double num2=   Double.parseDouble(etNum2.getText().toString());
                answer=num1%num2;
            }
        });
        btnDivide.setOnClickListener(view -> {

            if (checkValidation()){

                double num1=   Double.parseDouble(etNum1.getText().toString());
                double num2=   Double.parseDouble(etNum2.getText().toString());

                if (num2==0){
                    Toast.makeText(this, "You cannot divide a number by zero", Toast.LENGTH_SHORT).show();
                }else{
                    answer=num1/num2;
                }

            }else{
                Toast.makeText(this, "Some fileds are empty", Toast.LENGTH_SHORT).show();
            }
        });

        btnEqual.setOnClickListener(view -> {

         int intAnswer= (int)(answer);
            txtAnswer.setText(String.valueOf(intAnswer));
            answer=0;
            etNum1.setText("");
            etNum2.setText("");
        });


    }

    private boolean checkValidation() {
        boolean isValidate = false;
        if (etNum1.getText().toString().isEmpty() || etNum2.getText().toString().isEmpty()) {

            isValidate = false;

        } else if (!etNum1.getText().toString().isEmpty() && !etNum2.getText().toString().isEmpty()) {

            isValidate = true;
        }

        return isValidate;
    }




    public void Click(View view){

     startActivity(new Intent(MainActivity.this,MainActivity2.class));
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"On Resume");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"On ReStart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"On Destroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"On Pause");

    }
}