package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            File file1 = new File("MyFile1.txt");
            File file2 = new File("MyFile2.txt");
            if (!file1.exists()) {
                file1.createNewFile();
            }
            if (!file2.exists()) {
                file2.createNewFile();
            }
            PrintWriter pw1 = new PrintWriter(file1);
            pw1.println(5);
            pw1.println(3);
            pw1.println(7);
            pw1.println(5);
            pw1.close();
            PrintWriter pw2 = new PrintWriter(file2);
            pw2.println(4000);
            pw2.println(3000);
            pw2.println(2000);
            pw2.println(1000);
            pw2.close();
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }

        new File3CreatingThread().start();
        new File4CreatingThread().start();

    }
}