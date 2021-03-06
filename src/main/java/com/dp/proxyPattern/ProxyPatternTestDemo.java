package com.dp.proxyPattern;

import com.dp.proxyPattern.proxy.ProxyImage;

public class ProxyPatternTestDemo {

    public static void main(String[] args) {
        Image readImage = new ProxyImage("test.jpg");

        readImage.display();

        System.out.println("***");

        readImage.display();
    }
}
