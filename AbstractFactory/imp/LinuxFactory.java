package DesignPattern.AbstractFactory.imp;

import DesignPattern.AbstractFactory.interfaces.Alert;
import DesignPattern.AbstractFactory.interfaces.Button;
import DesignPattern.AbstractFactory.interfaces.Factory;

public class LinuxFactory implements Factory {
    @Override
    public Alert getAlert() {
        return new LinuxAlert();
    }

    @Override
    public Button getButton() {
        return new LinuxButton();
    }
}
