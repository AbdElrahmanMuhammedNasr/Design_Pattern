package DesignPattern.AbstractFactory;

import DesignPattern.AbstractFactory.imp.LinuxFactory;
import DesignPattern.AbstractFactory.interfaces.Factory;

class Final   {
    Factory factory;
    public Final(Factory factory){
        this.factory = factory;
    }


    public void getA() {
         this.factory.getAlert().printAlert();
//        return false;
    }


    public void getB() {
        this.factory.getButton().printButton();
    }
}



public class main {
    public static void main(String[] args) {
        Final linux = new Final( new LinuxFactory());
        linux.getA();
        linux.getB();
    }
}
