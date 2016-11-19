package com.example.aa.savethechildren;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Comparison extends AppCompatActivity {
//Compare current diet to the either of the diets. Prints out the three nutrients of the lowest percentage. and prints out the food with the three highest nutrients...
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comparison);

        // changes Title and Subtitle
        android.support.v7.app.ActionBar ab = getSupportActionBar();

        ab.setTitle("Compare your diets");

    }

    Intent intent = getIntent();

    public void ToNewDiet(View view) {
        Intent intent = new Intent(this, NewDiet.class);
        Button toNewDiet = (Button) findViewById(R.id.toNewDiet);
        startActivity(intent);

    }



}
