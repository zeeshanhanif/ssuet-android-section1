package com.example.android.db1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by zeeshanhanif-pc on 11/27/2016.
 */
public class ProductListArrayAdapter extends ArrayAdapter<Product> {

    public ProductListArrayAdapter(Context context,ArrayList<Product> productList){
        super(context,0,productList);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.product_item,parent,false);

        TextView productName = (TextView) view.findViewById(R.id.productNameView);
        TextView productPrice = (TextView) view.findViewById(R.id.productPriceView);
        TextView productId = (TextView) view.findViewById(R.id.productIdView);

        Product product = getItem(position);
        productId.setText(String.valueOf(product.getId()));
        productName.setText(product.getName());
        productPrice.setText(""+product.getPrice());

        return view;
    }
}
