package com.example.android.db1;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MyDatabaseHelper mydb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mydb = new MyDatabaseHelper(this);

        Button addProduct = (Button) findViewById(R.id.addProduct);
        Button getProducts = (Button) findViewById(R.id.getProducts);

        addProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mydb.addProduct(1,"Cooking Oil",200);
            }
        });

        getProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mydb.getProducts();
            }
        });


    }
}
