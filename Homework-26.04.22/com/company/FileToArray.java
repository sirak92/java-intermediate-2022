package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileToArray {


    public String[] fileToArray() {
        String str;
        String[] strArr = new String[0];
        try (
                BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\gnelt\\IdeaProjects\\FromFileToArray\\src\\MyFile.txt"))) {

            ArrayList<String> list = new ArrayList<>();
            while ((str = reader.readLine()) != null) {
                if (!str.isEmpty()) {
                    list.add(str);

                }
            }
            strArr = list.toArray(new String[0]);
        } catch (IOException e) {
            e.printStackTrace();


        }
        return strArr;

    }


}
