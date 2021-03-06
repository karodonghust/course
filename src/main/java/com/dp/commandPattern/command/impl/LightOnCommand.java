package com.dp.commandPattern.command.impl;

import com.dp.commandPattern.command.Command;
import com.dp.commandPattern.compenent.Light;

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
        light.off();
    }
}
