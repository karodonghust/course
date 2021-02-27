package com.designPattern.proxyPattern.proxy;

import com.designPattern.proxyPattern.Image;
import com.designPattern.proxyPattern.impl.ImageImpl;

public class ProxyImage implements Image {

    private ImageImpl realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new ImageImpl(fileName);
        }
        realImage.display();
    }
}
