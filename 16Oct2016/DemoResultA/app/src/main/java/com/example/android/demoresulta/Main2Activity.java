package com.example.android.demoresulta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView = (TextView) findViewById(R.id.textView1);
        Button btn1 = (Button) findViewById(R.id.btn1);

        Intent i  = getIntent();
        if(i != null){
            String data = i.getStringExtra("data");
            textView.setText(data);
        }

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main2Activity.this,"Hello in Activity 2",Toast.LENGTH_SHORT).show();

                Intent i = new Intent();
                i.putExtra("newKey","New Data");

                setResult(200,i);
            }
        });

    }
}
