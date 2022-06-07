package DesignPattern.Startegy.imp;

import DesignPattern.Startegy.Interface.IDisplayBehavior;

public class SimplyDisplay implements IDisplayBehavior {
    @Override
    public void display() {
        System.out.println(" i  simple display");
    }
}
