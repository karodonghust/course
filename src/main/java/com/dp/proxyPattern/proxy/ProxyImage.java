package com.dp.proxyPattern.proxy;

import com.dp.proxyPattern.Image;
import com.dp.proxyPattern.impl.ImageImpl;

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
