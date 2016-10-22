package com.example.android.demonavigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String data = "";
        Intent i = getIntent();
        if(i != null){
            data = i.getStringExtra("data");
        }
        TextView text1 = (TextView) findViewById(R.id.textView1);
        text1.setText(data);

    }
}
