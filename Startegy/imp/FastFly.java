package DesignPattern.Startegy.imp;

import DesignPattern.Startegy.Interface.IFlyBehavior;

public class FastFly implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("I  fast fly");
    }
}
