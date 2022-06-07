package DesignPattern.Command.imp;

import DesignPattern.Command.interfaces.ICommand;

public class CommandOpen implements ICommand {
    Light light;
    public CommandOpen(Light light){
        this.light = light;
    }
    @Override
    public void exec() {
        this.light.turnOn();
    }

    @Override
    public void unexec() {
        this.light.turnOff();

    }
}
