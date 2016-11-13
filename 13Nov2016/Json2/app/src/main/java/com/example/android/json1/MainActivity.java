package com.example.android.json1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    //String json = "{'name':'Abc','age':'45'}";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Hello",Toast.LENGTH_SHORT).show();

                try {

                    JSONObject jsonObject = new JSONObject();
                    jsonObject.put("name","Xyz");
                    jsonObject.put("email","xyz@yahoo.com");
                    jsonObject.put("isFeePaid",true);
                    jsonObject.put("GPA",3.2);

                    JSONArray jsonArray = new JSONArray();
                    jsonArray.put("C#");
                    jsonArray.put("JAVA");
                    jsonArray.put("Android");
                    jsonArray.put("JavaScript");

                    jsonObject.put("courses",jsonArray);



                    String objToJson = jsonObject.toString();
                    Toast.makeText(MainActivity.this,"obj = "+objToJson,Toast.LENGTH_SHORT).show();
                    Log.d("JSON","obj = "+objToJson);

                    /*String name = jsonObject.getString("name");
                    Toast.makeText(MainActivity.this,"Name = "+name,Toast.LENGTH_SHORT).show();
                    int age = jsonObject.getInt("Age");
                    Toast.makeText(MainActivity.this,"Age = "+age,Toast.LENGTH_SHORT).show();
*/

                } catch (JSONException e) {
                    e.printStackTrace();
                }


            }
        });


    }
}
