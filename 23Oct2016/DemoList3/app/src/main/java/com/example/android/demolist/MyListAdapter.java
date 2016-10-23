package com.example.android.demolist;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by zeeshanhanif-pc on 10/23/2016.
 */
public class MyListAdapter extends ArrayAdapter<Contact> {

    private Contact[] myContactList;

    public MyListAdapter(Context context,Contact[] contactList) {
        super(context,0,contactList);
        myContactList = contactList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        if(convertView ==null){
            Log.d("MainView","ConvertView Null");
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        else {
            Log.d("MainView","ConvertView Not null");
        }


        TextView contact = (TextView) view.findViewById(R.id.contact);
        contact.setText(myContactList[position].getName());

        TextView number = (TextView) view.findViewById(R.id.number);
        number.setText(""+myContactList[position].getNumber());

        return view;
    }

}
