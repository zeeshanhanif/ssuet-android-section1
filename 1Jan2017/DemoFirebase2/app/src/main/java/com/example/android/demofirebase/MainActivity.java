package com.example.android.demofirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    TextView messageDisplay;
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
        User u = new User(firstName.getText().toString(),
                lastName.getText().toString());
        dbRef.setValue(u);
        //dbRef.setValue(message.getText().toString());
    }

    private void addFirebaseListeners(){
        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                User value = dataSnapshot.getValue(User.class);
                //Toast.makeText(MainActivity.this,value,Toast.LENGTH_SHORT).show();
                messageDisplay.setText(value.getFirstName()+" - "+value.getLastName());
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
