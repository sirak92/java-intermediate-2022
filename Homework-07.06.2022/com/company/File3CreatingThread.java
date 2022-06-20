package com.company;

import java.io.*;
import java.util.Scanner;


class File3CreatingThread extends Thread {
    public void run() {
        System.out.println("thread3 starts");
        try {
            File file3 = new File("MyFile3.txt");

            if (!file3.exists()) {
                file3.createNewFile();
            }

            int sum = 0;
            Scanner MyReader = new Scanner(new File("MyFile1.txt"));

            while (MyReader.hasNextLine()) {
                sum = sum + Integer.parseInt(MyReader.nextLine());
            }
            MyReader.close();
            PrintWriter myPr = new PrintWriter(file3);
            myPr.println(sum);
            myPr.close();
            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}