package com.dp.facadePattern.facade;

import com.dp.facadePattern.Karo;

public class KaroFacade {
    Karo karo;

    public KaroFacade(Karo karo){
        this.karo = karo;
    }

    public void life(){
        karo.born();
        karo.eat();
        karo.sleep();
        karo.die();
    }
}
