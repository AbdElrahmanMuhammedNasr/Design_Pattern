package DesignPattern.Startegy.imp;

import DesignPattern.Startegy.Interface.IFlyBehavior;

public class SimpleFly implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("i simple fly");
    }
}
