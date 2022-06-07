package DesignPattern.Observer.imp;

import DesignPattern.Observer.interfaces.IObserver;

public class Website implements IObserver {

    int temp;
    WeatherStation weatherStation;

    public Website(WeatherStation weatherStation){
        this.weatherStation= weatherStation;
    }
    @Override
    public void update() {
        temp = this.weatherStation.getTemp();
        System.out.println(temp + " is update in Website");
    }
}
