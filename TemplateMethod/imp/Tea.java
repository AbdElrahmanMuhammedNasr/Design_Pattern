package DesignPattern.TemplateMethod.imp;

import DesignPattern.TemplateMethod.abstracts.HotDrinkMaker;

public class Tea extends HotDrinkMaker {
    @Override
    protected void addType() {
        System.out.println("add Tea");
    }
}
