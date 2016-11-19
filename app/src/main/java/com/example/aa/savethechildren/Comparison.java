package com.example.aa.savethechildren;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.io.InputStream;
import java.util.List;

public class Comparison extends AppCompatActivity {

    public String E1 = "A";
    public String E2;
    public String P1;
    public String P2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comparison);

        // changes Title and Subtitle
        android.support.v7.app.ActionBar ab = getSupportActionBar();

        ab.setTitle("Compare your diets");
       // compareEnergy();
        //Find the three nutrients most lacking from the current diet
        //Set the three textView to these
        TextView needed_nutrition1 = (TextView)findViewById(R.id.needed_nutrition1);
        needed_nutrition1.setText("Energy");

        TextView needed_nutrition2 = (TextView)findViewById(R.id.needed_nutrition2);
        needed_nutrition2.setText("Protein");

        //Find the 3 best foods to tackle each and set the check box labels
        //Checkboxes for nutrition 1
        CheckBox nutrition1_1 = (CheckBox)findViewById(R.id.nutrition1_1);
        String temp="ffasd";
        nutrition1_1.setText(E1);


        CheckBox nutrition1_2 = (CheckBox)findViewById(R.id.nutrition1_2);
        nutrition1_2.setText(E2);

        //Checkboxes for nutrition 2
        CheckBox nutrition2_1 = (CheckBox)findViewById(R.id.nutrition2_1);
        nutrition2_1.setText("nutrition2_1 checkbox");
        CheckBox nutrition2_2 = (CheckBox)findViewById(R.id.nutrition2_2);
        nutrition2_2.setText("nutrition2_2 checkbox");

    }

    Intent intent = getIntent();

    public void ToNewDiet(View view) {
        Intent intent = new Intent(this, NewDiet.class);
        Button toNewDiet = (Button) findViewById(R.id.toNewDiet);
        startActivity(intent);

    }

    public void compareEnergy(){
        boolean first=true;
        InputStream inputStream = getResources().openRawResource(R.raw.fhab);
        CsvFile csvFile = new CsvFile(inputStream);
        List<String[]> scoreList = csvFile.read();
        int i=0;
        for (String[] str : scoreList) {
            if (i<13) {
                String[] fhab = str[i].split(",");
                System.out.println(fhab[1]);
                if ((Float.valueOf(fhab[5]) > 10.0)) {
                    if (first == true) {
                        E1 = fhab[0];
                        first = false;
                    } else
                        E2 = fhab[0];
                }
                i++;
            }
        }


    }

}