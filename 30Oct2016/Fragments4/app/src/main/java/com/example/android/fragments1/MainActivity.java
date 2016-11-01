package com.example.android.fragments1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements BlankFragment.FragmentInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BlankFragment fragment = new BlankFragment();


        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.content,fragment)
                .commit();

    }

    @Override
    public void doSomeWork(String data) {
        Toast.makeText(this,"Data From Fragment = "+data,Toast.LENGTH_SHORT).show();
        TextView textView = (TextView) findViewById(R.id.textView1);
        textView.setText(data);

    }
}
