package com.example.android.demosavestate;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String questions[] = new String[]{
            "First Question",
            "Second Question",
            "Third Question",
            "Forth Question",
            "Fifth Question",
            "Sixth Question",
    };

    int counter;

    private static final String COUNTER_KEY = "COUNTER";
    private static final String PREF_FILE = "mypreffile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Main","onCreate");

        if(savedInstanceState != null){
            Toast.makeText(this,"Bundle not Null",Toast.LENGTH_SHORT).show();
            counter = savedInstanceState.getInt(COUNTER_KEY);
        }
        else {
            Toast.makeText(this,"Bundle IS Null",Toast.LENGTH_SHORT).show();
            SharedPreferences preferences = getSharedPreferences(PREF_FILE,0);
            counter = preferences.getInt(COUNTER_KEY,0);


        }

        final TextView questionText = (TextView) findViewById(R.id.questionText);
        questionText.setText(questions[counter]);

        Button btnNext = (Button) findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                questionText.setText(questions[++counter]);
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Main","onStop");

        SharedPreferences preferences = getSharedPreferences(PREF_FILE,0);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(COUNTER_KEY,counter);
        editor.commit();




    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Main","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Main","onPause");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Main","onStart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Main","onDestroy");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("Main","onSaveInstanceState");
        outState.putInt(COUNTER_KEY,counter);


    }
}
