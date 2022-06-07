package DesignPattern.Factroy.imp;

import DesignPattern.Factroy.interfaces.Animal;

public class Lion implements Animal {
    @Override
    public void printName() {
        System.out.println("I am lion");
    }
}
