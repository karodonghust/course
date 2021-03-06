package com.dp.commandPattern.compenent;

public class Stereo {

    public void on(){
        System.out.println("the stereo is on");
    }

    public void off(){
        System.out.println("the stereo is off");
    }

    public void setCd(){
        System.out.println("the cd has been set");
    }

    public void setDvd(){
        System.out.println("the dvd has been set");
    }

    public void setRadio(){
        System.out.println("the radio has been set");
    }

    public void setVolume(int volume){
        System.out.println("The volume has been set: " + volume);
    }
}
