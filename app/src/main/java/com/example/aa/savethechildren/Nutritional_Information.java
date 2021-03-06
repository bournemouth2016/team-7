package com.example.aa.savethechildren;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Nutritional_Information extends AppCompatActivity {
//percentage of actual diet we have. i.e. RDA. So total and then collate data...
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutritional__information);
        // changes Title and Subtitle
        android.support.v7.app.ActionBar ab = getSupportActionBar();

        ab.setTitle("Nutritional information per week");
        float protein=MainActivity.totalProtein();
        TextView protein_Percent = (TextView)findViewById(R.id.protein_Percent);
        protein_Percent.setText(String.format("%.2f", protein)+"% of RI");
        float energy=MainActivity.totalEnergy();
        TextView energy_Percent = (TextView)findViewById(R.id.energy_Percent);
        energy_Percent.setText(String.format("%.2f", energy)+"% of RI");
        float cost=MainActivity.totalCost();
        TextView cost_Percent = (TextView)findViewById(R.id.cost_Percent);
        cost_Percent.setText(String.format("%.2f", cost)+" rupees");
    }

    Intent intent = getIntent();

    public void Compare_Diets(View view) {
        Intent intent = new Intent(this, Comparison.class);
        Button compare_Diets = (Button) findViewById(R.id.compare_Diets);
        startActivity(intent);


    }


}
