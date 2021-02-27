package com.designPattern.proxyPattern.impl;

import com.designPattern.proxyPattern.Image;

public class ImageImpl implements Image {

    private String fileName;

    public ImageImpl(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
