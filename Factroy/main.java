package DesignPattern.Factroy;

import DesignPattern.Factroy.imp.RandomAnimalFactory;
import DesignPattern.Factroy.interfaces.Animal;

public class main {
    public static void main(String[] args) {
        Animal a = new RandomAnimalFactory().generateAnimal(1);
        a.printName();
        Animal a2 = new RandomAnimalFactory().generateAnimal(3);
        a2.printName();
    }
}
