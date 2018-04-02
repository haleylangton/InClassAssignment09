package com.example.h.inclassassignment09;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference animalRef = database.getReference("animal");
    private DatabaseReference animalsRef = database.getReference("animal2");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void set(View view) {
        animalRef.setValue(new Animal ("Wolf", 4, true));
    }

    public void add(View view){
        animalsRef.push().setValue(new Animal ("Rhino",4,false));
    }
}
