package DesignPattern.Decorator;

import DesignPattern.Decorator.imp.Caremal;
import DesignPattern.Decorator.imp.Espreso;
import DesignPattern.Decorator.imp.Milk;

public class main {
    public static void main(String[] args) {
//        Caremal b=  ;

        Milk m = new Milk(new Caremal(new Espreso()));
        System.out.println( m.cost());
    }
}
