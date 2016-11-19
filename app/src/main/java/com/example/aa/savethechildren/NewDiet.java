package com.example.aa.savethechildren;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NewDiet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_diet);

        // changes Title and Subtitle
        android.support.v7.app.ActionBar ab = getSupportActionBar();

        ab.setTitle("New diet");
    }

    Intent intent = getIntent();

}
