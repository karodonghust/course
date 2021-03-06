package com.dp.commandPattern.command.impl;

import com.dp.commandPattern.command.Command;
import com.dp.commandPattern.compenent.GarageDoor;

public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;



    public  GarageDoorOpenCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }
    @Override
    public void execute() {
        garageDoor.lightOn();
    }

    @Override
    public void undo() {
        garageDoor.lightOff();
    }
}
