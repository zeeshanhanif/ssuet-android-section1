package com.example.android.fragment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button first = (Button) findViewById(R.id.first);
        Button second = (Button) findViewById(R.id.second);
        Button third = (Button) findViewById(R.id.third);

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.content1,new FirstFragment())
                        .commit();
            }
        });

        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.content2,new SecondFragment())
                        .commit();
            }
        });

        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.content3,new ThirdFragment())
                        .commit();
            }
        });
    }
}
