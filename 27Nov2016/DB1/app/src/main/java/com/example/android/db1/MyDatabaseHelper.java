package com.example.android.db1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by zeeshanhanif-pc on 11/27/2016.
 */
public class MyDatabaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "newinventory.db";
    private static final int DB_VERSION = 1;

    private static final String PRODUCT_TABLE_NAME = "product";

    public MyDatabaseHelper(Context context){
        super(context,DB_NAME,null,DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+ PRODUCT_TABLE_NAME +" (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, price integer)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("Drop table if exists "+PRODUCT_TABLE_NAME);
        onCreate(db);
    }

    public void addProduct(Product product){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("name",product.getName());
        values.put("price",product.getPrice());

        db.insert(PRODUCT_TABLE_NAME, null, values);
        db.close();

    }

    public ArrayList<Product> getProducts(){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from "+PRODUCT_TABLE_NAME,null);

        ArrayList<Product> products = new ArrayList<Product>();
        while(cursor.moveToNext()){
            //int index = cursor.getColumnIndex("name");
            int id = cursor.getInt(0);
            String name = cursor.getString(1);
            int price = cursor.getInt(2);

            products.add(new Product(id,name,price));


            Log.d("DBResult","Id = "+id +" - Name = "+name+" - Price = "+price);

        }

        db.close();
        return products;

    }
}
