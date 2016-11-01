package com.example.android.fragments1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BlankFragment fragment = new BlankFragment();


        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.content,fragment)
                .commit();

    }
}
