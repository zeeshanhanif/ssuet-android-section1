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
    EditText message;
    Button updateBtn;
    FirebaseDatabase database;
    DatabaseReference dbRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        messageDisplay = (TextView) findViewById(R.id.messageDisplay);
        message = (EditText) findViewById(R.id.message);
        updateBtn = (Button) findViewById(R.id.update);
        initFirebase();
        addFirebaseListeners();
    }

    private void initFirebase(){
        database = FirebaseDatabase.getInstance();
        dbRef = database.getReference("messages");
    }

    public void updateData(View view) {
        dbRef.setValue(message.getText().toString());
    }

    private void addFirebaseListeners(){
        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                //Toast.makeText(MainActivity.this,value,Toast.LENGTH_SHORT).show();
                messageDisplay.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
