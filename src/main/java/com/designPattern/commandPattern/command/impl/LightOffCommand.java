package com.designPattern.commandPattern.command.impl;

import com.designPattern.commandPattern.command.Command;
import com.designPattern.commandPattern.compenent.Light;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {

    }
}
