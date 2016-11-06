package com.example.android.async1;

import android.content.Intent;
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
                int num =  Integer.parseInt(editText1.getText().toString());
                task.execute(num);
            }
        });
    }

    public class MyTask extends AsyncTask<Integer,String,Integer>{

        @Override
        protected Integer doInBackground(Integer... params) {

            //Toast.makeText(MainActivity.this,"Hello in AsyncTask",Toast.LENGTH_SHORT).show();
            int count = 0;
            for(int i=0;i<params[0];i++){
                Log.d("MyTask","Hello = "+i);
                count += i * 3;
                publishProgress("New Data = "+i);
            }

            return count;
        }

        @Override
        protected void onProgressUpdate(String... values) {
            //
            textView1.setText(values[0]);
        }

        @Override
        protected void onPostExecute(Integer result) {
            Toast.makeText(MainActivity.this,"AsyncTask Completed , output = "+result,Toast.LENGTH_SHORT).show();
        }
    }
}
