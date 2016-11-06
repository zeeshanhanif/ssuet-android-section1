package com.example.android.network1;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

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
                task.execute(editText1.getText().toString());
                ///httpCalls();
            }
        });
    }

    private String httpCalls(String urlInput){

        try {
            URL url = new URL(urlInput);
            //URL url = new URL("http://www.yahoo.com");
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.connect();
            InputStream is =  urlConnection.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            String data = "";

            while(true){
                String temp = br.readLine();

                if(temp == null){
                    break;
                }
                data += temp;

            }

            Log.d("HTTP","Data = "+data);
            return data;




        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //HttpURLConnection

        return null;

    }


    public class MyTask extends AsyncTask<String,Void,String>{

        @Override
        protected String doInBackground(String... params) {
            String data = httpCalls(params[0]);
            return data;
        }

        @Override
        protected void onPostExecute(String result) {
            textView1.setText(result);
        }
    }

}
