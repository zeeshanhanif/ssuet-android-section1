package com.example.android.db2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    MyDatabaseHelper mydb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mydb = new MyDatabaseHelper(this);

        final EditText productName = (EditText) findViewById(R.id.productName);
        final EditText productPrice = (EditText) findViewById(R.id.productPrice);

        Button addProduct = (Button) findViewById(R.id.addProduct);
        Button getProducts = (Button) findViewById(R.id.getProducts);

        addProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Product p = new Product
                        (productName.getText().toString(),
                                Integer.parseInt(productPrice.getText().toString()));
                mydb.addProduct(p);
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
