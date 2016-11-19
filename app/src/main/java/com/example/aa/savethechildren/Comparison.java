package com.example.aa.savethechildren;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class Comparison extends AppCompatActivity {

    public String E1;
    public float EQ1;
    public String E2;
    public float EQ2;
    public String P1;
    public float PQ1;
    public String P2;
    public float PQ2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comparison);

        // changes Title and Subtitle
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setTitle("Compare your diets");

        //These 2 functions pick the two options the user can pick for energy and protein
        compareEnergy();
        compareProtein();

        //This makes the Energy and Protein headers
        TextView needed_nutrition1 = (TextView)findViewById(R.id.needed_nutrition1);
        needed_nutrition1.setText("Energy");
        TextView needed_nutrition2 = (TextView)findViewById(R.id.needed_nutrition2);
        needed_nutrition2.setText("Protein");

        //This assigns the options decided earlier onto the check boxes.
        CheckBox nutrition1_1 = (CheckBox)findViewById(R.id.nutrition1_1);
        nutrition1_1.setText(E1);
        CheckBox nutrition1_2 = (CheckBox)findViewById(R.id.nutrition1_2);
        nutrition1_2.setText(E2);
        CheckBox nutrition2_1 = (CheckBox)findViewById(R.id.nutrition2_1);
        nutrition2_1.setText(P1);
        CheckBox nutrition2_2 = (CheckBox)findViewById(R.id.nutrition2_2);
        nutrition2_2.setText(P2);

    }

    //T
    Intent intent = getIntent();
    public void ToNewDiet(View view) {
        final CheckBox checkBox = (CheckBox) findViewById(R.id.nutrition1_1);
        if (checkBox.isChecked()) {
            MainActivity.plan[0][1]=String.valueOf(Float.valueOf(MainActivity.plan[0][1])+EQ1);
        }
        else{
            MainActivity.plan[13][1]=String.valueOf(Float.valueOf(MainActivity.plan[13][1])+EQ2);
        }
        final CheckBox checkBox1 = (CheckBox) findViewById(R.id.nutrition2_1);
        if (checkBox1.isChecked()) {
            MainActivity.plan[0][1]=String.valueOf(Float.valueOf(MainActivity.plan[0][1])+PQ1);
        }
        else{
            MainActivity.plan[9][1]=String.valueOf(Float.valueOf(MainActivity.plan[9][1])+PQ2);
        }
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
                if ((Float.valueOf(str[3]) > 10.0)) {
                    if (first == true) {
                        E1 = str[0];
                        EQ1=2;
                        first = false;
                    } else {
                        E2 = str[0];
                        EQ2 = 2;
                    }
                }
                i++;
            }
        }
    }
    public void compareProtein(){
        boolean first=true;
        InputStream inputStream = getResources().openRawResource(R.raw.fhab);
        CsvFile csvFile = new CsvFile(inputStream);
        List<String[]> scoreList = csvFile.read();
        int i=0;
        for (String[] str : scoreList) {
            if (i<13) {
                if ((Float.valueOf(str[1]) > Float.valueOf(MainActivity.plan[i][1])*52 ) & (Float.valueOf(str[1]) > 10.0)) {
                    if (first == true) {
                        P1 = str[0];
                        PQ1=2;
                        first = false;
                    } else {
                        P2 = str[0];
                        PQ2 = 2;
                    }
                }
                i++;
            }
        }
    }
}