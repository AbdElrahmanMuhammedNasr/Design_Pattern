package DesignPattern.Adapter;

import DesignPattern.Adapter.imp.Adaptee;
import DesignPattern.Adapter.imp.Adapter;
import DesignPattern.Adapter.interfaces.ITarget;

public class main {
    public static void main(String[] args) {

        ITarget iTarget = new Adapter(new Adaptee());
        iTarget.request();
    }
}
