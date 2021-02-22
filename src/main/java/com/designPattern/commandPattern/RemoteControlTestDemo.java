package com.designPattern.commandPattern;

import com.designPattern.commandPattern.command.impl.StereoOnWithCDCommand;
import com.designPattern.commandPattern.compenent.GarageDoor;
import com.designPattern.commandPattern.compenent.Light;
import com.designPattern.commandPattern.command.impl.GarageDoorOpenCommand;
import com.designPattern.commandPattern.command.impl.LightOnCommand;
import com.designPattern.commandPattern.compenent.Stereo;
import com.designPattern.commandPattern.remote.SimpleRemoteControl;

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

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        Stereo stereo = new Stereo();
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        remote.setCommand(stereoOn);
        remote.buttonWasPressed();
    }
}
