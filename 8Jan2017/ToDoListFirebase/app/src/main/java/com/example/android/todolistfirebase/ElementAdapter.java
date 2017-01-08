package com.example.android.todolistfirebase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by zeeshanhanif-pc on 1/8/2017.
 */
public class ElementAdapter extends ArrayAdapter<Element> {

    public ElementAdapter(Context context, ArrayList<Element> elementArrayList) {
        super(context, 0, elementArrayList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View elementView = convertView;

        if (elementView == null){

            elementView = LayoutInflater.from(getContext()).inflate(R.layout.list_elements, parent, false);
        }

        Element currentElement = getItem(position);

        CheckBox checkElement = (CheckBox) elementView.findViewById(R.id.checked_element);
        TextView textElement = (TextView) elementView.findViewById(R.id.text_element);

        textElement.setText(currentElement.getCurrentElement());
        checkElement.setChecked(currentElement.isCheckedElements());

        return elementView;
    }
}
