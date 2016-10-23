package com.example.android.demolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by zeeshanhanif-pc on 10/23/2016.
 */
public class MyListAdapter extends ArrayAdapter<String> {

    private String[] myContactList;

    public MyListAdapter(Context context,String[] contactList) {
        super(context,0,contactList);
        myContactList = contactList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        TextView contact = (TextView) view.findViewById(R.id.contact);
        contact.setText(myContactList[position]);

        return view;
    }

}
