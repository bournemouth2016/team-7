package com.example.aa.savethechildren;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void ToNutInfo(View view) {
        Intent intent = new Intent(this, Nutritional_Information.class);
        Button toNutInfo = (Button) findViewById(R.id.toNutInfo);
        startActivity(intent);
    }

}
