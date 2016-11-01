package com.example.android.demolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String[] contacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fillContacts();

        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,contacts);
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.list_item, R.id.contact,  contacts);
        MyListAdapter adapter = new MyListAdapter(this,contacts);
        ListView listView = (ListView) findViewById(R.id.contactList);
        listView.setAdapter(adapter);
        //R.layout.list_item

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Position = "+position+" == Value = "+contacts[position],Toast.LENGTH_SHORT).show();
            }
        });


    }

    private void fillContacts(){
        contacts = new String[50];
        for(int i=0;i<contacts.length;i++){
            contacts[i] = "Contact "+(i+1);
        }
    }
}
