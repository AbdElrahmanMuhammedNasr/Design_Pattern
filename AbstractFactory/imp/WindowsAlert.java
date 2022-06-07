package DesignPattern.AbstractFactory.imp;

import DesignPattern.AbstractFactory.interfaces.Alert;

public class WindowsAlert implements Alert {
    @Override
    public void printAlert() {
        System.out.println("Windows alert");
    }
}
