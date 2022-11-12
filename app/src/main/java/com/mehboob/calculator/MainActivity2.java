package com.mehboob.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
private TextView textView;
private static final String TAG="MainActivity2";
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=findViewById(R.id.txtBack);


        textView.setOnClickListener(view -> {

        onBackPressed();
        });


        //


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