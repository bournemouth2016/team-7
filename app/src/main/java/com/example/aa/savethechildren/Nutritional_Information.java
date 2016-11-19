package com.example.aa.savethechildren;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Nutritional_Information extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutritional__information);
    }

    Intent intent = getIntent();

    public void Compare_Diets(View view) {
        Intent intent = new Intent(this, Comparison.class);
        Button compare_Diets = (Button) findViewById(R.id.compare_Diets);
        startActivity(intent);
    }


}
