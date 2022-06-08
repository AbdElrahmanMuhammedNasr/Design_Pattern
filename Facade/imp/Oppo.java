package DesignPattern.Facade.imp;

import DesignPattern.Facade.interfaces.Mobile;

public class Oppo implements Mobile {
    @Override
    public void modelNo() {
        System.out.println("Oppo");
    }

    @Override
    public void price() {
        System.out.println("2000");

    }
}
