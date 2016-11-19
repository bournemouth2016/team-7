package com.example.aa.savethechildren;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    public static String[][] plan = new String[14][5];
    private String name;



    @Override
    public String toString() {
        return name;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // changes Title and Subtitle
        android.support.v7.app.ActionBar ab = getSupportActionBar();

        ab.setTitle("Current diet per kg per week");

        InputStream inputStream = getResources().openRawResource(R.raw.fhab);
        CsvFile csvFile = new CsvFile(inputStream);

        List<String[]> scoreList = csvFile.read();

        for (String[] str : scoreList) {
            //System.out.println(Arrays.toString(str));
        }
    }

    public void MessageBox(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    public void ToNutInfo(View view) {
        Button toNutInfo = (Button) findViewById(R.id.toNutInfo);
        final EditText aalu =  (EditText) findViewById(R.id.aalu_current);
        Float aaluCurrent = Float.parseFloat(aalu.getText().toString());
        Aalu(aaluCurrent);
        final EditText aata =  (EditText) findViewById(R.id.aata_current);
        Float aataCurrent = Float.parseFloat(aata.getText().toString());
        Aata(aataCurrent);
        final EditText bajra =  (EditText) findViewById(R.id.bajra_current);
        Float bajraCurrent = Float.parseFloat(bajra.getText().toString());
        Bajra(bajraCurrent);
        final EditText bhainsKaDudh =  (EditText) findViewById(R.id.bhainsKaDudh_current);
        Float bhainsKaDudhCurrent = Float.parseFloat(bhainsKaDudh.getText().toString());
        Bhains(bhainsKaDudhCurrent);
        final EditText breastMik =  (EditText) findViewById(R.id.breastMilk_current);
        Float breastMilkCurrent = Float.parseFloat(breastMik.getText().toString());
        Breast(breastMilkCurrent);
        final EditText chauliHaraSaahg =  (EditText) findViewById(R.id.chauliHaraSaahg_current);
        Float chauliHaraSaahgCurrent = Float.parseFloat(chauliHaraSaahg.getText().toString());
        Chauli(chauliHaraSaahgCurrent);
        final EditText cholaSafed =  (EditText) findViewById(R.id.cholaSafed_current);
        Float cholaSafedCurrent = Float.parseFloat(cholaSafed.getText().toString());
        Chola(cholaSafedCurrent);
        final EditText chotiMachli =  (EditText) findViewById(R.id.chotiMachli_current);
        Float chotiMachliCurent = Float.parseFloat(chotiMachli.getText().toString());
        Choti(chotiMachliCurent);
        final EditText coriander =  (EditText) findViewById(R.id.coriander_current);
        Float corianderCurrent = Float.parseFloat(coriander.getText().toString());
        Coriander(corianderCurrent);
        final EditText lalSaag =  (EditText) findViewById(R.id.lalSaag_current);
        Float lalSaagCurrent = Float.parseFloat(lalSaag.getText().toString());
        Lal(lalSaagCurrent);
        final EditText methiSaag =  (EditText) findViewById(R.id.methiSaag_current);
        Float methiSaagCurrent = Float.parseFloat(methiSaag.getText().toString());
        Methi(methiSaagCurrent);
        final EditText nariyal =  (EditText) findViewById(R.id.nariyal_current);
        Float nariyalCurrent = Float.parseFloat(nariyal.getText().toString());
        Nariyal(nariyalCurrent);
        final EditText sarson =  (EditText) findViewById(R.id.sarson_current);
        Float sarsonCurrent = Float.parseFloat(sarson.getText().toString());
        Sarson(sarsonCurrent);
        final EditText tejpata =  (EditText) findViewById(R.id.tejpata_current);
        Float tejpataCurrent = Float.parseFloat(tejpata.getText().toString());
        Tejpata(tejpataCurrent);
        Intent intent = new Intent(this, Nutritional_Information.class);
        startActivity(intent);


    }
    public void Aalu(float quantity) {
        plan[0][0] = "Aalu";
        plan[0][1] = Float.toString(quantity);
        plan[0][2]=Float.toString((float) (quantity*24.16));
        plan[0][3]=Float.toString((float) (quantity*0.2));
        plan[0][4]=Float.toString((float) (quantity*0.12));
        return;
    }

    public void Aata(float quantity) {
        plan[1][0] = "Aata";
        plan[1][1] = Float.toString(quantity);
        plan[1][2]=Float.toString((float) (quantity*17.83));
        plan[1][3]=Float.toString((float) (quantity*1.01));
        plan[1][4]=Float.toString((float) (quantity*1.34));
        return;
    }

    public void Bajra(float quantity) {
        plan[2][0] = "Bajra";
        plan[2][1] = Float.toString(quantity);
        plan[2][2]=Float.toString((float) (quantity*14.24));
        plan[2][3]=Float.toString((float) (quantity*1.08));
        plan[2][4]=Float.toString((float) (quantity*1.05));
        return;
    }

    public void Bhains(float quantity) {
        plan[3][0] = "Bhains ka dudh";
        plan[3][1] = Float.toString(quantity);
        plan[3][2]=Float.toString((float) (quantity*38.69));
        plan[3][3]=Float.toString((float) (quantity*0.3));
        plan[3][4]=Float.toString((float) (quantity*0.38));
        return;
    }

    public void Breast(float quantity) {
        plan[4][0] = "Breast milk";
        plan[4][1] = Float.toString(quantity);
        plan[4][2]=Float.toString((float) (quantity*0));
        plan[4][3]=Float.toString((float) (quantity*0.73));
        plan[4][4]=Float.toString((float) (quantity*0.4));
        return;
    }

    public void Chauli(float quantity) {
        plan[5][0] = "Chauli Hara saag";
        plan[5][1] = Float.toString(quantity);
        plan[5][2]=Float.toString((float) (quantity*12.71));
        plan[5][3]=Float.toString((float) (quantity*0.07));
        plan[5][4]=Float.toString((float) (quantity*0.2));
        return;
    }

    public void Chola(float quantity) {
        plan[6][0] = "Chola safed";
        plan[6][1] = Float.toString(quantity);
        plan[6][2]=Float.toString((float) (quantity*22));
        plan[6][3]=Float.toString((float) (quantity*0.6));
        plan[6][4]=Float.toString((float) (quantity*1.1));
        return;
    }

    public void Choti(float quantity) {
        plan[7][0] = "Choti Machli";
        plan[7][1] = Float.toString(quantity);
        plan[7][2]=Float.toString((float) (quantity*22));
        plan[7][3]=Float.toString((float) (quantity*0.6));
        plan[7][4]=Float.toString((float) (quantity*1.1));
        return;
    }

    public void Coriander(float quantity) {
        plan[8][0] = "Coriander leaf raw";
        plan[8][1] = Float.toString(quantity);
        plan[8][2]=Float.toString((float) (quantity*14));
        plan[8][3]=Float.toString((float) (quantity*0.3));
        plan[8][4]=Float.toString((float) (quantity*0.3));
        return;
    }

    public void Lal(float quantity) {
        plan[9][0] = "Lal saag";
        plan[9][1] = Float.toString(quantity);
        plan[9][2]=Float.toString((float) (quantity*27.7));
        plan[9][3]=Float.toString((float) (quantity*0.1));
        plan[9][4]=Float.toString((float) (quantity*0.46));
        return;
    }

    public void Methi(float quantity) {
        plan[10][0] = "Methi Saag";
        plan[10][1] = Float.toString(quantity);
        plan[10][2]=Float.toString((float) (quantity*31.6));
        plan[10][3]=Float.toString((float) (quantity*0.14));
        plan[10][4]=Float.toString((float) (quantity*0.42));
        return;
    }

    public void Nariyal(float quantity) {
        plan[11][0] = "Nariyal";
        plan[11][1] = Float.toString(quantity);
        plan[11][2]=Float.toString((float) (quantity*42));
        plan[11][3]=Float.toString((float) (quantity*2.4));
        plan[11][4]=Float.toString((float) (quantity*0.7));
        return;
    }

    public void Sarson(float quantity) {
        plan[11][0] = "Sarson";
        plan[11][1] = Float.toString(quantity);
        plan[11][2]=Float.toString((float) (quantity*14));
        plan[11][3]=Float.toString((float) (quantity*0.5));
        plan[11][4]=Float.toString((float) (quantity*0.8));
        return;
    }

    public void Tejpata(float quantity) {
        plan[12][0] = "Tejpata";
        plan[12][1] = Float.toString(quantity);
        plan[12][2]=Float.toString((float) (quantity*5));
        plan[12][3]=Float.toString((float) (quantity*0));
        plan[12][4]=Float.toString((float) (quantity*0));
        return;
    }

    public static float totalCost(){
        float total=0;
        for (int i=0;i<13;i++){
            total+=Float.parseFloat(plan[i][2]);
        }
    return total;
    }

    public static float totalProtein() {
        float total = 0;
        for (int i = 0; i < 13; i++) {
            total += Float.parseFloat(plan[i][4]);
        }
        return total*52;
    }

    public static float totalEnergy() {
        float total = 0;
        for (int i = 0; i < 13; i++) {
            total += Float.parseFloat(plan[i][3]);
        }
        return total*52;
    }
}
