package com.example.android.async1;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText1;
    private TextView textView1;
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
        addListeners();
    }

    private void initComponents(){
        editText1 = (EditText) findViewById(R.id.editText1);
        textView1 = (TextView) findViewById(R.id.textView1);
        btn1 = (Button) findViewById(R.id.btn1);
    }

    private void addListeners(){
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Hello Btn1",Toast.LENGTH_SHORT).show();
                MyTask task = new MyTask();
                task.execute();
            }
        });
    }

    public class MyTask extends AsyncTask<Void,Void,Void>{

        @Override
        protected Void doInBackground(Void... params) {

            //Toast.makeText(MainActivity.this,"Hello in AsyncTask",Toast.LENGTH_SHORT).show();
            for(int i=0;i<100;i++){
                Log.d("MyTask","Hello = "+i);
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            Toast.makeText(MainActivity.this,"AsyncTask Completed",Toast.LENGTH_SHORT).show();
        }
    }
}
