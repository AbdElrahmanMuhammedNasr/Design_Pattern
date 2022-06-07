package DesignPattern.Factroy.imp;

import DesignPattern.Factroy.interfaces.Animal;
import DesignPattern.Factroy.interfaces.AnimalFactory;

public class RandomAnimalFactory implements AnimalFactory {
    @Override
    public Animal generateAnimal(int number) {
        Animal animal = null;
        switch (number){
            case 1 : animal =  new Dog(); break;
            case 2 : animal = new Cat(); break;
            case 3 : animal = new Lion();break;
        }

        return animal;
    }
}
