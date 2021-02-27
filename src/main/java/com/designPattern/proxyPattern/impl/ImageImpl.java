package com.designPattern.proxyPattern.impl;

import com.designPattern.proxyPattern.Image;

public class ImageImpl implements Image {

    @Override
    public void display() {
        System.out.println("the image has bean drew");
    }
}
