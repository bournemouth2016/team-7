package com.example.aa.savethechildren;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NewDiet extends AppCompatActivity {
//Adding enough of the previous foods to bring the old diet to get all the nutrients required are met.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_diet);

        // changes Title and Subtitle
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setTitle("New diet");
        TextView Aalu = (TextView)findViewById(R.id.aalu_current);
        Aalu.setText(MainActivity.plan[0][1]);
        TextView Aata = (TextView)findViewById(R.id.aata_current);
        Aata.setText(MainActivity.plan[1][1]);
        TextView Bajra = (TextView)findViewById(R.id.bajra_current);
        Bajra.setText(MainActivity.plan[2][1]);
        TextView Bhains = (TextView)findViewById(R.id.bhainsKaDudh_current);
        Bhains.setText(MainActivity.plan[3][1]);
        TextView Breast = (TextView)findViewById(R.id.breastMilk_current);
        Breast.setText(MainActivity.plan[4][1]);
        TextView Chauli = (TextView)findViewById(R.id.chauliHaraSaahg_current);
        Chauli.setText(MainActivity.plan[5][1]);
        TextView Chola = (TextView)findViewById(R.id.cholaSafed_current);
        Chola.setText(MainActivity.plan[6][1]);
        TextView Choti = (TextView)findViewById(R.id.chotiMachli_current);
        Choti.setText(MainActivity.plan[7][1]);
        TextView Corriander = (TextView)findViewById(R.id.coriander_current);
        Corriander.setText(MainActivity.plan[8][1]);
        TextView Lal = (TextView)findViewById(R.id.lalSaag_current);
        Lal.setText(MainActivity.plan[9][1]);
        TextView Methi = (TextView)findViewById(R.id.methiSaag_current);
        Methi.setText(MainActivity.plan[10][1]);
        TextView Nariyal = (TextView)findViewById(R.id.nariyal_current);
        Nariyal.setText(MainActivity.plan[11][1]);
        TextView Sarson = (TextView)findViewById(R.id.sarson_current);
        Sarson.setText(MainActivity.plan[12][1]);
        TextView Tejpata = (TextView)findViewById(R.id.tejpata_current);
        Tejpata.setText(MainActivity.plan[13][1]);
    }

    Intent intent = getIntent();

}
