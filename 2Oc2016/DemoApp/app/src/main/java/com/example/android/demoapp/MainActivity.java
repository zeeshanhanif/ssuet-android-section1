package com.example.android.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        EditText name = (EditText)findViewById(R.id.name);
        //Toast.makeText(this,name.getText().toString(),Toast.LENGTH_SHORT).show();
        String nameVal = getResources().getString(R.string.lastName);
        Toast.makeText(this,nameVal,Toast.LENGTH_SHORT).show();
    }
}
