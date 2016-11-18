package com.example.manav.myapplication;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    CharSequence text = "Hello toast.";
    int duration = Toast.LENGTH_SHORT;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View v) {
        if (v.getId() == R.id.button) {
            MessageBox("This is a test.");
        }
    }

    public void MessageBox(String message) {
        Toast.makeText(this, message, duration).show();
    }


    // this is trash code :)

    /*private void onClick() {

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());

                builder.setMessage("Hello");

                AlertDialog dialog = builder.create();
            }
        });
    }*/
    
    // end of trash code

}

