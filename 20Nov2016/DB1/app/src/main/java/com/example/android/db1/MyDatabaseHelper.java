package com.example.android.db1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by zeeshanhanif-pc on 11/20/2016.
 */
public class MyDatabaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "inventory.db";
    private static final int DB_VERSION = 1;

    private static final String PRODUCT_TABLE_NAME = "product";

    public MyDatabaseHelper(Context context){
        super(context,DB_NAME,null,DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table product (_id integer, name TEXT, price integer)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("Drop table if exists product");
        onCreate(db);
    }

    public void addProduct(int id, String name, int price){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("_id",id);
        values.put("name",name);
        values.put("price",price);

        db.insert(PRODUCT_TABLE_NAME, null, values);
        db.close();

    }

    public void getProducts(){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from product",null);

        while(cursor.moveToNext()){
            //int index = cursor.getColumnIndex("name");
            int id = cursor.getInt(0);
            String name = cursor.getString(1);
            int price = cursor.getInt(2);

            Log.d("DBResult","Id = "+id +" - Name = "+name+" - Price = "+price);

        }

        db.close();




    }
}
