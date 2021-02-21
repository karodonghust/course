package com.designPattern.commandPattern;

import com.designPattern.commandPattern.compenent.GarageDoor;
import com.designPattern.commandPattern.compenent.Light;
import com.designPattern.commandPattern.impl.GarageDoorOpenCommand;
import com.designPattern.commandPattern.impl.LightOnCommand;

public class RemoteControlTestDemo {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        remote.setCommand(garageDoorOpen);
        remote.buttonWasPressed();
    }
}
