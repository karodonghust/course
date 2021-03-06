package com.dp.commandPattern.command.impl;

import com.dp.commandPattern.command.Command;
import com.dp.commandPattern.compenent.Stereo;

public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
