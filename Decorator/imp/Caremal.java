package DesignPattern.Decorator.imp;

import DesignPattern.Decorator.absreatClasses.Bavarage;
import DesignPattern.Decorator.absreatClasses.Decorator;

public class Caremal extends Decorator {
    Bavarage bavarage;
    public Caremal(Bavarage bavarage){
        this.bavarage = bavarage;
    }

    @Override
    public int cost() {
        return this.bavarage.cost() + 2;
    }
}
