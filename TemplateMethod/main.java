package DesignPattern.TemplateMethod;

import DesignPattern.TemplateMethod.abstracts.HotDrinkMaker;
import DesignPattern.TemplateMethod.imp.Nescafe;
import DesignPattern.TemplateMethod.imp.Tea;

public class main {
    public static void main(String[] args) {
        HotDrinkMaker tea = new Tea();
        tea.operation();

        System.out.println("-------------------");
        HotDrinkMaker n = new Nescafe();
        n.operation();
    }
}
