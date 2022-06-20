package com.company;

import java.io.*;
import java.util.Scanner;

public class File4CreatingThread extends Thread{
    public void run() {
        try {
            System.out.println("thread4 starts");
            File file4 = new File("MyFile4.txt");

            if (!file4.exists()) {
                file4.createNewFile();
            }

            int sum = 0;
            Scanner MyReader = new Scanner(new File("MyFile2.txt"));

            while (MyReader.hasNextLine()) {
                sum = sum + Integer.parseInt(MyReader.nextLine());
            }
            MyReader.close();
            PrintWriter myPr1 = new PrintWriter(file4);
            myPr1.println(sum);
            myPr1.close();
            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
