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
        Float aaluCurrent = Float.parseFloat(aalu.getText().toString());
        final EditText aata =  (EditText) findViewById(R.id.aata_current);
        Float aataCurrent = Float.parseFloat(aata.getText().toString());
        final EditText bajra =  (EditText) findViewById(R.id.bajra_current);
        Float bajraCurrent = Float.parseFloat(bajra.getText().toString());
        final EditText bhainsKaDudh =  (EditText) findViewById(R.id.bhainsKaDudh_current);
        Float bhainsKaDudhCurrent = Float.parseFloat(bhainsKaDudh.getText().toString());
        final EditText breastMik =  (EditText) findViewById(R.id.breastMilk_current);
        Float breastMilkCurrent = Float.parseFloat(breastMik.getText().toString());
        final EditText chauliHaraSaahg =  (EditText) findViewById(R.id.chauliHaraSaahg_current);
        Float chauliHaraSaahgCurrent = Float.parseFloat(chauliHaraSaahg.getText().toString());
        final EditText cholaSafed =  (EditText) findViewById(R.id.cholaSafed_current);
        Float cholaSafedCurrent = Float.parseFloat(cholaSafed.getText().toString());
        final EditText chotiMachli =  (EditText) findViewById(R.id.chotiMachli_current);
        Float chotiMachliCurent = Float.parseFloat(chotiMachli.getText().toString());
        final EditText coriander =  (EditText) findViewById(R.id.coriander_current);
        Float corianderCurrent = Float.parseFloat(coriander.getText().toString());
        final EditText lalSaag =  (EditText) findViewById(R.id.lalSaag_current);
        Float lalSaagCurrent = Float.parseFloat(lalSaag.getText().toString());
        final EditText methiSaag =  (EditText) findViewById(R.id.methiSaag_current);
        Float methiSaagCurrent = Float.parseFloat(methiSaag.getText().toString());
        final EditText nariyal =  (EditText) findViewById(R.id.nariyal_current);
        Float nariyalCurrent = Float.parseFloat(nariyal.getText().toString());
        final EditText sarson =  (EditText) findViewById(R.id.sarson_current);
        Float sarsonCurrent = Float.parseFloat(sarson.getText().toString());
        final EditText tejpata =  (EditText) findViewById(R.id.tejpata_current);
        Float tejpataCurrent = Float.parseFloat(tejpata.getText().toString());

    }

}
