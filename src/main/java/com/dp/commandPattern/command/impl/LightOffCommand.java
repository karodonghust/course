package com.dp.commandPattern.command.impl;

import com.dp.commandPattern.command.Command;
import com.dp.commandPattern.compenent.Light;

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
        light.on();
    }
}
