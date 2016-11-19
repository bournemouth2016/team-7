package com.example.aa.savethechildren;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Comparison extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comparison);

        // changes Title and Subtitle
        android.support.v7.app.ActionBar ab = getSupportActionBar();

        ab.setTitle("Compare your diets");

        //Find the three nutrients most lacking from the current diet
        //Set the three textView to these
        TextView needed_nutrition1 = (TextView)findViewById(R.id.needed_nutrition1);
        needed_nutrition1.setText("Nutrient most needed");

        TextView needed_nutrition2 = (TextView)findViewById(R.id.needed_nutrition2);
        needed_nutrition2.setText("Nutrient 2nd most needed");

        TextView needed_nutrition3 = (TextView)findViewById(R.id.needed_nutrition3);
        needed_nutrition3.setText("Nutrient 3rd most needed");

        //Find the 3 best foods to tackle each and set the check box labels
        //Checkboxes for nutrition 1
        CheckBox nutrition1_1 = (CheckBox)findViewById(R.id.nutrition1_1);
        nutrition1_1.setText("nutrition1_1 checkbox");

        CheckBox nutrition1_2 = (CheckBox)findViewById(R.id.nutrition1_2);
        nutrition1_2.setText("nutrition1_2 checkbox");

        CheckBox nutrition1_3 = (CheckBox)findViewById(R.id.nutrition1_3);
        nutrition1_3.setText("nutrition1_3 checkbox");

        //Checkboxes for nutrition 2
        CheckBox nutrition2_1 = (CheckBox)findViewById(R.id.nutrition2_1);
        nutrition2_1.setText("nutrition2_1 checkbox");

        CheckBox nutrition2_2 = (CheckBox)findViewById(R.id.nutrition2_2);
        nutrition2_2.setText("nutrition2_2 checkbox");

        CheckBox nutrition2_3 = (CheckBox)findViewById(R.id.nutrition2_3);
        nutrition2_3.setText("nutrition2_3 checkbox");

        //Checkboxes for nutrition 3
        CheckBox nutrition3_1 = (CheckBox)findViewById(R.id.nutrition3_1);
        nutrition3_1.setText("nutrition3_1 checkbox");

        CheckBox nutrition3_2 = (CheckBox)findViewById(R.id.nutrition3_2);
        nutrition3_2.setText("nutrition3_2 checkbox");

        CheckBox nutrition3_3 = (CheckBox)findViewById(R.id.nutrition3_3);
        nutrition3_3.setText("nutrition3_3 checkbox");
    }

    Intent intent = getIntent();

    public void ToNewDiet(View view) {
        Intent intent = new Intent(this, NewDiet.class);
        Button toNewDiet = (Button) findViewById(R.id.toNewDiet);
        startActivity(intent);

    }



}