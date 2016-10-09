package com.example.android.demoevents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.btn1);
        MyListener mylist = new MyListener();
        btn1.setOnClickListener(mylist);

        editView = (EditText) findViewById(R.id.editText1);

    }

    public class MyListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this,"Hello Click",Toast.LENGTH_SHORT).show();

        }
    }
}
