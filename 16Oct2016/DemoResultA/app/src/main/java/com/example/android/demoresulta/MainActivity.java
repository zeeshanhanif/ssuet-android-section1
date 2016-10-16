package com.example.android.demoresulta;

import android.content.Intent;
import android.renderscript.Script;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int ACTION1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText text1 = (EditText) findViewById(R.id.text1);
        Button button = (Button) findViewById(R.id.btnNext);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Hello in Activity 1",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("data",text1.getText().toString());
                startActivityForResult(i,ACTION1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == ACTION1 && resultCode==200){
            Toast.makeText(MainActivity.this,"Result Activity 2 Success == "+data.getStringExtra("newKey"),Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(MainActivity.this,"Return Activity 2",Toast.LENGTH_SHORT).show();
        }


    }
}
