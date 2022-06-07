package DesignPattern.Startegy.imp;

import DesignPattern.Startegy.Interface.IDisplayBehavior;

public class LandDisplay implements IDisplayBehavior {
    @Override
    public void display() {
        System.out.println(" i  land display");
    }
}
