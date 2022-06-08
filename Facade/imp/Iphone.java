package DesignPattern.Facade.imp;

import DesignPattern.Facade.interfaces.Mobile;

public class Iphone implements Mobile {
    @Override
    public void modelNo() {
        System.out.println("iphone");
    }

    @Override
    public void price() {
        System.out.println("200");

    }
}
