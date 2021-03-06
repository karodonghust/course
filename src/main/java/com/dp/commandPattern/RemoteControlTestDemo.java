package com.dp.commandPattern;

import com.dp.commandPattern.command.impl.StereoOnWithCDCommand;
import com.dp.commandPattern.compenent.GarageDoor;
import com.dp.commandPattern.compenent.Light;
import com.dp.commandPattern.command.impl.GarageDoorOpenCommand;
import com.dp.commandPattern.command.impl.LightOnCommand;
import com.dp.commandPattern.compenent.Stereo;
import com.dp.commandPattern.remote.SimpleRemoteControl;

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
