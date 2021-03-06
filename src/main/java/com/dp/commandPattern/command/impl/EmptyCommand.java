package com.dp.commandPattern.command.impl;

import com.dp.commandPattern.command.Command;

public class EmptyCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
