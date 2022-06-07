package DesignPattern.Command;

import DesignPattern.Command.imp.CommandClose;
import DesignPattern.Command.imp.CommandOpen;
import DesignPattern.Command.imp.Invoker;
import DesignPattern.Command.imp.Light;

public class main {
    public static void main(String[] args) {
        Light light = new Light();

        CommandOpen command = new CommandOpen(light);
        CommandClose command2 = new CommandClose(light);

        Invoker invoker = new Invoker(command,command2);
        invoker.on();
        invoker.off();

    }
}
