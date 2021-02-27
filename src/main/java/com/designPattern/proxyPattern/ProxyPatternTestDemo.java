package com.designPattern.proxyPattern;

import com.designPattern.proxyPattern.proxy.ProxyImage;

public class ProxyPatternTestDemo {

    public static void main(String[] args) {
        Image readImage = new ProxyImage("test.jpg");

        readImage.display();

        System.out.println("***");

        readImage.display();
    }
}
