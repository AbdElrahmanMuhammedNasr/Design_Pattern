package DesignPattern.AbstractFactory.imp;

import DesignPattern.AbstractFactory.interfaces.Alert;
import DesignPattern.AbstractFactory.interfaces.Button;
import DesignPattern.AbstractFactory.interfaces.Factory;

public class WindowsFactory implements Factory {
    @Override
    public Alert getAlert() {
        return new WindowsAlert();
    }

    @Override
    public Button getButton() {
        return new WindowsButton();
    }
}
