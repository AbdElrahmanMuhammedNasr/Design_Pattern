package DesignPattern.Facade.imp;

import DesignPattern.Facade.interfaces.Mobile;

public class Samsung implements Mobile {
    @Override
    public void modelNo() {
        System.out.println("samsung");
    }

    @Override
    public void price() {
        System.out.println("2000");

    }
}
