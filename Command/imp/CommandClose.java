package DesignPattern.Command.imp;

import DesignPattern.Command.interfaces.ICommand;

public class CommandClose implements ICommand {
    Light light;
    public CommandClose(Light light){
        this.light = light;
    }
    @Override
    public void exec() {
        this.light.turnOff();
    }

    @Override
    public void unexec() {
        this.light.turnOn();

    }
}
