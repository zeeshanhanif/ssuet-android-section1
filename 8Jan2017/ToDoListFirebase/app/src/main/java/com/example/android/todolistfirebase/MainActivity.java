package com.example.android.todolistfirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText editElement;
    private Button addEelements;
    private Button deleteElements;

    private ArrayList<Element> elementArrayList;
    private ElementAdapter elementAdapter;
    private ListView elementList;
    private Element element;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        attachingWidgets();

        elementArrayList = new ArrayList<Element>();

        elementAdapter = new ElementAdapter(this, elementArrayList);
        elementList.setAdapter(elementAdapter);

        attachingListeners();
        firebaseListeners();
    }

    public void attachingWidgets(){

        editElement = (EditText) findViewById(R.id.edit_elements);
        addEelements = (Button) findViewById(R.id.add_elements);
        deleteElements = (Button)findViewById(R.id.delete_elements);
        elementList = (ListView) findViewById(R.id.listed_elements);
    }

    public void attachingListeners(){

        addEelements.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                element = new Element(false, editElement.getText().toString(),
                        FirebaseDatabase.getInstance().getReference()
                        .child("ToDo").push().getKey());

                FirebaseDatabase.getInstance().getReference()
                        .child("ToDo")
                        .child(element.getPushId())
                        .setValue(element);

                /*elementArrayList.add(element);

                elementAdapter.notifyDataSetChanged();*/

                editElement.setText("");
            }
        });
    }

    public void firebaseListeners(){

        FirebaseDatabase.getInstance().getReference().child("ToDo")
                .addChildEventListener(new ChildEventListener() {
                    @Override
                    public void onChildAdded(DataSnapshot dataSnapshot, String s) {

                        Element element = dataSnapshot.getValue(Element.class);

                        elementArrayList.add(element);
                        elementAdapter.notifyDataSetChanged();
                    }

                    @Override
                    public void onChildChanged(DataSnapshot dataSnapshot, String s) {

                    }

                    @Override
                    public void onChildRemoved(DataSnapshot dataSnapshot) {

                    }

                    @Override
                    public void onChildMoved(DataSnapshot dataSnapshot, String s) {

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
    }
}
