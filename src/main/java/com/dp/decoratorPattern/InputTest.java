package com.dp.decoratorPattern;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

    public static void main(String[] args) {
        int c;
        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("/Users/karo/Desktop/test.txt")));
            while ((c = in.read()) >0){
                System.out.print((char)c);
            }
            System.out.println();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
