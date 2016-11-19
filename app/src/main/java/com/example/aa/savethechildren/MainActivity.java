package com.example.aa.savethechildren;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.opencsv.CSVReader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

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

        ab.setTitle("Current diet");

        InputStream inputStream = getResources().openRawResource(R.raw.fhab);
        CsvFile csvFile = new CsvFile(inputStream);



        List<String[]> scoreList = csvFile.read();

        for (String[] str : scoreList) {
            System.out.println(Arrays.toString(str));
        }



// void Aalu(Float float, String[1][5])
    }
    /*public static void Aalu(float quantity) {
        plan[0][0] = "Aalu";
        plan[0][1] = Float.toString(quantity);
      //  calculate(0, "Aalu", quantity); // Change index and name
    }*/

    /*public void Method(Float lol, String[][] arr, String name) {
        arr = new String[1][5];
        float x = lol;
        arr[0][0] = name; // Name of the food
        arr[0][1] = Float.toString(lol); // quantity
        //arr[0][2] = calculate(); // TODO: implement CSV integration // cost
        // TODO: implement life
        //arr[0][3] =


    }*/



    public void MessageBox(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    public String[] readfile(Context context) {
        String[] no = new String[1];
        no[0]="";
        try {
            FileInputStream fis = context.openFileInput("Food-Index.txt");
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(isr);
            String[] sb = new String[14];
            int i=0;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                sb[i]=line;
                i++;
            }
            return sb;
        } catch (FileNotFoundException e) {
            MessageBox("moo");
            return no;
        } catch (UnsupportedEncodingException e) {
            return no;
        } catch (IOException e) {
            return no;
        }
    }

    private  void calculate(int index, float quantity, String[] poo) {
         for (int i=0;i<14;i++){
            String[] item = poo[i].split(",");
                plan[index][2] = Float.toString(quantity * Float.parseFloat(item[3]));
                plan[index][3] = Float.toString(quantity * Float.parseFloat(item[5]));
                plan[index][4] = Float.toString(quantity * Float.parseFloat(item[6]));
            // MessageBox("Poop");
        }
    }

    public void ToNutInfo(View view) {
        Intent intent = new Intent(this, Nutritional_Information.class);
        Button toNutInfo = (Button) findViewById(R.id.toNutInfo);
        startActivity(intent);
        String[] poo=readfile(getApplicationContext());
       //calculate(0,2,poo);
        final EditText aalu =  (EditText) findViewById(R.id.aalu_current);
        Float aaluCurrent = Float.parseFloat(aalu.getText().toString());
       // Aalu(aaluCurrent);
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
