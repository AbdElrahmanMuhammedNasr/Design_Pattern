package DesignPattern.AbstractFactory.imp;

import DesignPattern.AbstractFactory.interfaces.Alert;

public class LinuxAlert implements Alert {
    @Override
    public void printAlert() {
        System.out.println("Linux alert");
    }
}
