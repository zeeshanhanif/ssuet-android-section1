package com.example.android.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    final String msg ="Main :";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg,"The onCreate() event ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg,"The onStart() event ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg,"The onResume() event ");
    }

    @Override
    protected void onPause() {

        super.onPause();
        Log.d(msg,"The onPause() event ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg,"The onStop() event ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(msg,"The onDestroy() event ");
    }

    public void act2(View view) {
        Intent in =new Intent(this,HelloActivity.class);
        startActivity(in);
    }


    public void act3(View view) {
        Intent in =new Intent(this,ThirdActivity.class);
        startActivity(in);
    }
}
