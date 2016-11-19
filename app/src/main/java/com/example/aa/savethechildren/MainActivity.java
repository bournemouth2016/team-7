package com.example.aa.savethechildren;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // changes Title and Subtitle
        android.support.v7.app.ActionBar ab = getSupportActionBar();

        ab.setTitle("Current diet");

    }

    public void ToNutInfo(View view) {
        Intent intent = new Intent(this, Nutritional_Information.class);
        Button toNutInfo = (Button) findViewById(R.id.toNutInfo);
        startActivity(intent);

        final EditText aalu =  (EditText) findViewById(R.id.aalu_current);
        String aaluCurrent = aalu.getText().toString();
        final EditText aata =  (EditText) findViewById(R.id.aata_current);
        String aataCurrent = aata.getText().toString();
        final EditText bajra =  (EditText) findViewById(R.id.bajra_current);
        aalu.getText().toString();
        final EditText bhainsKaDudh =  (EditText) findViewById(R.id.bhainsKaDudh_current);
        aalu.getText().toString();
        final EditText breastMik =  (EditText) findViewById(R.id.breastMilk_current);
        aalu.getText().toString();
        final EditText chauliHaraSaahg =  (EditText) findViewById(R.id.chauliHaraSaahg_current);
        aalu.getText().toString();
        final EditText cholaSafed =  (EditText) findViewById(R.id.cholaSafed_current);
        aalu.getText().toString();
        final EditText chotiMachli =  (EditText) findViewById(R.id.chotiMachli_current);
        aalu.getText().toString();
        final EditText coriander =  (EditText) findViewById(R.id.coriander_current);
        aalu.getText().toString();
        final EditText lalSaag =  (EditText) findViewById(R.id.lalSaag_current);
        aalu.getText().toString();
        final EditText methiSaag =  (EditText) findViewById(R.id.methiSaag_current);
        aalu.getText().toString();
        final EditText nariyal =  (EditText) findViewById(R.id.nariyal_current);
        aalu.getText().toString();
        final EditText sarson =  (EditText) findViewById(R.id.sarson_current);
        aalu.getText().toString();
        final EditText tejpata =  (EditText) findViewById(R.id.tejpata_current);
        aalu.getText().toString();

    }

}
