package com.dp.facadePattern;

import com.dp.facadePattern.facade.KaroFacade;
import com.dp.facadePattern.impl.KaroImpl;

public class FacadePatternTestDemo {

    public static void main(String[] args) {
        KaroFacade karoFacade = new KaroFacade(new KaroImpl());
        karoFacade.life();
    }
}
