package com.example.android.demofirstapp;

import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout li =new LinearLayout(this);
        li.setOrientation(LinearLayout.HORIZONTAL);
        TextView v = new TextView(this);
        v.setText("hello");
        li.addView(v);
    }
}
