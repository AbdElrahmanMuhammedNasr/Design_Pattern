package DesignPattern.Adapter.imp;

import DesignPattern.Adapter.interfaces.ITarget;

public class Adapter implements ITarget {
    Adaptee adaptee;
    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public void request() {
        this.adaptee.specificRequest();
    }
}
