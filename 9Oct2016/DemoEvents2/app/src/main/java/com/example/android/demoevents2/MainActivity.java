package com.example.android.demoevents2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.btn1);

        btn1.setOnClickListener(this);

        final EditText editView = (EditText) findViewById(R.id.editText1);

        Button btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Hello Click 2",Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this,"Hello Click with Interface implemented",Toast.LENGTH_SHORT).show();
    }
}
