package com.example.android.db1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button addProduct;
    private Button getProducts;
    private EditText nameEditText;
    private EditText priceEditText;
    private ListView productListView;
    private MyDatabaseHelper myDatabaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDatabaseHelper = new MyDatabaseHelper(this);

        initComponents();
        addListeners();
    }

    private void initComponents(){
        addProduct = (Button) findViewById(R.id.addProduct);
        getProducts = (Button) findViewById(R.id.getProducts);
        nameEditText = (EditText) findViewById(R.id.nameEditText);
        priceEditText = (EditText) findViewById(R.id.priceEditText);
        productListView = (ListView) findViewById(R.id.productListView);

        /*ArrayList<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("new data");
        list.add("work");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);

        productListView.setAdapter(adapter);*/

    }

    private void addListeners(){
        addProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Product p = new Product(nameEditText.getText().toString(), Integer.parseInt(priceEditText.getText().toString()));
                myDatabaseHelper.addProduct(p);

                Toast.makeText(MainActivity.this,"Add Product",Toast.LENGTH_SHORT).show();
            }
        });

        getProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ArrayList<Product> list = myDatabaseHelper.getProducts();
                ProductListArrayAdapter productListArrayAdapter = new ProductListArrayAdapter(MainActivity.this,list);
                productListView.setAdapter(productListArrayAdapter);

                Toast.makeText(MainActivity.this,"Get Products Product",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
