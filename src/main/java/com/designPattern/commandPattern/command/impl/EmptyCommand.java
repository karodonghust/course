package com.designPattern.commandPattern.command.impl;

import com.designPattern.commandPattern.command.Command;

public class EmptyCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
