package com.example.aa.savethechildren;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by aa on 19/11/16.
 */

public class CsvFile {
    InputStream inputStream;

    public CsvFile(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public List<String[]> read() {
        List<String[]> resultList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        try {
            String csvLine;
            while ((csvLine = reader.readLine()) != null) {
                String[] row = csvLine.split(",");
                resultList.add(row);
            }
        } catch (IOException e) {
            System.err.println("cant read csv" + e.getMessage());
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                System.err.println("cant close csv" + e.getMessage());
            }
        }
        return resultList;
    }
}
