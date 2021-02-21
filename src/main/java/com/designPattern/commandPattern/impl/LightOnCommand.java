package com.designPattern.commandPattern.impl;

import com.designPattern.commandPattern.Command;
import com.designPattern.commandPattern.compenent.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {

    }
}
