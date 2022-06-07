package DesignPattern.Factroy.imp;

import DesignPattern.Factroy.interfaces.Animal;

public class Cat implements Animal {
    @Override
    public void printName() {
        System.out.println("I am cat");
    }
}
