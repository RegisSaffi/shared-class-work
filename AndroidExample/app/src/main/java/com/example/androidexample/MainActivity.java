package com.example.androidexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text;
    Button button;

    int a=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text=findViewById(R.id.mytext);
        button=findViewById(R.id.mybytton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=a+1;

                Intent myintent=new Intent(getApplicationContext(),ActivityTwo.class);
                myintent.putExtra("increment",a);

                startActivity(myintent);

            }
        });

    }


}