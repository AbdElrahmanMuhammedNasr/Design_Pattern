package DesignPattern.Observer.imp;

import DesignPattern.Observer.interfaces.IObservable;
import DesignPattern.Observer.interfaces.IObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable {

        int temp = 40;
    List <IObserver> list = new ArrayList<>();

    @Override
    public void add(IObserver iObserver) {
        list.add(iObserver);
    }

    @Override
    public void remove(IObserver iObserver) {
        list.remove(iObserver);
    }

    @Override
    public void notifyUpdate() {
        for (IObserver o: list) {
            o.update();
        }
    }

    public int getTemp(){
        return temp;
    }
    public void changeTemp(){
        temp = (int) ((temp * (Math.random() * 100)));
    }
}
