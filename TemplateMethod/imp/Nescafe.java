package DesignPattern.TemplateMethod.imp;

import DesignPattern.TemplateMethod.abstracts.HotDrinkMaker;

public class Nescafe extends HotDrinkMaker {
    @Override
    protected void addType() {
        System.out.println("add Nescafe");
    }
}
