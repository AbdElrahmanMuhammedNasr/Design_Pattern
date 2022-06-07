package DesignPattern.Decorator.imp;

import DesignPattern.Decorator.absreatClasses.Bavarage;
import DesignPattern.Decorator.absreatClasses.Decorator;

public class Milk extends Decorator {
    Bavarage bavarage;
    public Milk(Bavarage bavarage){
        this.bavarage = bavarage;
    }
    @Override
    public int cost() {
        return this.bavarage.cost()  + 10;
    }
}
