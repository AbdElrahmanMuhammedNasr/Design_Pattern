package DesignPattern.Startegy;

import DesignPattern.Startegy.imp.FastFly;
import DesignPattern.Startegy.imp.LandDisplay;
import DesignPattern.Startegy.imp.SimpleFly;
import DesignPattern.Startegy.imp.SimplyDisplay;

public class main {

    public static void main(String[] args) {
        Duck d1 = new Duck(new SimplyDisplay() , new SimpleFly());
        d1.display();
        d1.fly();

        Duck d2 = new Duck(new LandDisplay() , new FastFly());
        d2.display();
        d2.fly();
    }
}
