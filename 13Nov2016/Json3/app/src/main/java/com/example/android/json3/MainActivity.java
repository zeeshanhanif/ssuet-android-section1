package com.example.android.json3;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText urlEditText = (EditText) findViewById(R.id.editTextUrl);
        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Hello",Toast.LENGTH_SHORT).show();
                MyNetworkTask myNetworkTask = new MyNetworkTask();
                myNetworkTask.execute(urlEditText.getText().toString());
            }
        });
    }

    private String httpCalls(String inputUrl){

        try {
            URL url = new URL(inputUrl);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.connect();

            InputStream is = httpURLConnection.getInputStream();
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
            return data;

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }


    private EarthQuakeInfo convertToJsonObject(String json){
        try {
            JSONObject jsonObject = new JSONObject(json);
            String type = jsonObject.getString("type");

            JSONObject metaJsonObject = jsonObject.getJSONObject("metadata");
            String title = metaJsonObject.getString("title");

            JSONArray featuresJsonArray = jsonObject.getJSONArray("features");
            JSONObject featureItemJsonObject =  featuresJsonArray.getJSONObject(0);
            JSONObject propertiesJsonObject = featureItemJsonObject.getJSONObject("properties");
            String mag = propertiesJsonObject.getString("mag");
            String place = propertiesJsonObject.getString("place");


            EarthQuakeInfo earthQuakeInfo = new EarthQuakeInfo(type,title,mag,place);

            return earthQuakeInfo;

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public class MyNetworkTask extends AsyncTask<String,Void,EarthQuakeInfo>{

        @Override
        protected EarthQuakeInfo doInBackground(String... params) {
            String result = httpCalls(params[0]);
            EarthQuakeInfo earthQuakeInfo =  convertToJsonObject(result);
            return earthQuakeInfo;
        }

        @Override
        protected void onPostExecute(EarthQuakeInfo earthQuakeInfo) {
            Toast.makeText(MainActivity.this,"Info : Mag = "+earthQuakeInfo.getMag()+"  ||| Place "+earthQuakeInfo.getPlace(),Toast.LENGTH_SHORT).show();
            Log.d("TASK","Info : Mag = "+earthQuakeInfo.getMag()+"  ||| Place "+earthQuakeInfo.getPlace());
        }
    }


}
