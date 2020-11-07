package com.example.androidexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityTwo extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);


        Intent intent2=getIntent();
        int a=intent2.getIntExtra("increment",0);

        tv=findViewById(R.id.tv);

        tv.setText("Excremental value is: "+a);

    }


}