package com.designPattern.commandPattern.impl;

import com.designPattern.commandPattern.Command;
import com.designPattern.commandPattern.compenent.GarageDoor;

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

    }
}
