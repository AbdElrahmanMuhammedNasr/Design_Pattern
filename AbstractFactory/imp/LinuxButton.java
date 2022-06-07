package DesignPattern.AbstractFactory.imp;

import DesignPattern.AbstractFactory.interfaces.Button;

public class LinuxButton implements Button {
    @Override
    public void printButton() {
        System.out.println( "Linux button");
    }
}
