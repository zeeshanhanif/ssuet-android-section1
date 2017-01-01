package com.example.android.demofirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    TextView messageDisplay;
    EditText userName;
    EditText firstName;
    EditText lastName;
    Button updateBtn;
    FirebaseDatabase database;
    DatabaseReference dbRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        messageDisplay = (TextView) findViewById(R.id.messageDisplay);
        userName = (EditText) findViewById(R.id.userName);
        firstName = (EditText) findViewById(R.id.firstName);
        lastName = (EditText) findViewById(R.id.lastName);
        updateBtn = (Button) findViewById(R.id.update);
        initFirebase();
        addFirebaseListeners();
    }

    private void initFirebase(){
        database = FirebaseDatabase.getInstance();
        dbRef = database.getReference("users");
    }

    public void updateData(View view) {
        User u = new User(userName.getText().toString(), firstName.getText().toString(),
                lastName.getText().toString());
        dbRef.push().setValue(u);
        //dbRef.child(u.getUserName()).setValue(u);
        //dbRef.setValue(message.getText().toString());
    }

    private void addFirebaseListeners(){
        dbRef.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
               User u = dataSnapshot.getValue(User.class);
               Toast.makeText(MainActivity.this,u.getUserName(),Toast.LENGTH_SHORT).show();
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
