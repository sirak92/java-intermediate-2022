package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {


        String file1;
        String file2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first file's path");
        file1 = sc.nextLine();
        Scanner s = new Scanner(System.in);
        System.out.println("enter the second file's path");
        file2 = s.nextLine();


        fileToFile(new File(file1), new File(file2));
    }

    private static void fileToFile(File source, File destination) throws IOException {
        try (InputStream is = new FileInputStream(source); OutputStream os = new FileOutputStream(destination)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        }

    }
}
