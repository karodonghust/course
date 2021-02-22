package com.designPattern.commandPattern.remote;

import com.designPattern.commandPattern.command.Command;
import com.designPattern.commandPattern.command.impl.EmptyCommand;

import java.util.Arrays;

public aspect RemoteControl {
    private final int SIZE = 7;
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[SIZE];
        offCommands = new Command[SIZE];

        Command emptyCommand = new EmptyCommand();
        for (int i = 0; i < SIZE; i++) {
            onCommands[i] = emptyCommand;
            offCommands[i] = emptyCommand;
        }
        undoCommand = emptyCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        if (slot < 0 || slot >= SIZE) {
            return;
        }
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        if (slot < 0 || slot >= SIZE) {
            return;
        }
        onCommands[slot].execute();
        undoCommand = onCommands[slot];

    }

    public void offButtonWasPressed(int slot) {
        if (slot < 0 || slot >= SIZE) {
            return;
        }
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPressed(){
        undoCommand.undo();
    }

    @Override
    public String toString() {
        return "RemoteControl{" +
                "onCommands=" + Arrays.toString(onCommands) +
                ", offCommands=" + Arrays.toString(offCommands) +
                '}';
    }
}