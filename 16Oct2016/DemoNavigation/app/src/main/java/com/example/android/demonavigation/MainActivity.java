package com.example.android.demonavigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText text1 = (EditText) findViewById(R.id.text1);


        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("data",text1.getText().toString());
                startActivity(i);
            }
        });
    }

   /* public void helloText(View view){
        Intent i = new Intent(this)
    }*/

}
