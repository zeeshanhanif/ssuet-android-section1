package com.example.android.demofindviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitInfo(View view){
        View view1 =  findViewById(R.id.editText_name);
        EditText ed_name = (EditText) view1;

        EditText email = (EditText)findViewById(R.id.editText_email);

        String name1 = ed_name.getText().toString();

        TextView tv_name = (TextView)findViewById(R.id.textView_name);
        tv_name.setText(name1);


        Toast.makeText(this,name1,Toast.LENGTH_SHORT).show();

    }
}
