package com.choongang;

import java.io.FileOutputStream;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutput = new FileOutputStream("java.txt");
            String word = "ja";

            byte b [] = word.getBytes();
            fileOutput.write(b);
            fileOutput.close();

        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
