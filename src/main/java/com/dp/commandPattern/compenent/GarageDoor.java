package com.dp.commandPattern.compenent;

public class GarageDoor {

    public void up(){
        System.out.println("the garage door is rising");
    }

    public void down(){
        System.out.println("the garege door is falling");
    }

    public void stop(){
        System.out.println("the garage door is stopped");
    }

    public void lightOn(){
        System.out.println("the garage door is open");
    }

    public void lightOff(){
        System.out.println("the garage door is closed");
    }
}
