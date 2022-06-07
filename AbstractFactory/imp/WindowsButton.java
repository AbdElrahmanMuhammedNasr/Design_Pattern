package DesignPattern.AbstractFactory.imp;

import DesignPattern.AbstractFactory.interfaces.Button;

public class WindowsButton implements Button {
    @Override
    public void printButton() {
        System.out.println( "windows button");
    }
}
