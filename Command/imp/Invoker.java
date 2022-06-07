package DesignPattern.Command.imp;

import DesignPattern.Command.interfaces.ICommand;

public class Invoker {
    ICommand on;
    ICommand off;


    public Invoker(ICommand on, ICommand off) {
        this.on = on;
        this.off = off;
    }

    public void  on(){
        this.on.exec();
    }
    public void off(){
        this.off.exec();
    }

}
