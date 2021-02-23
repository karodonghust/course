package com.designPattern.facadePattern;

import com.designPattern.facadePattern.facade.KaroFacade;
import com.designPattern.facadePattern.impl.KaroImpl;

public class FacadePatternTestDemo {

    public static void main(String[] args) {
        KaroFacade karoFacade = new KaroFacade(new KaroImpl());
        karoFacade.life();
    }
}
