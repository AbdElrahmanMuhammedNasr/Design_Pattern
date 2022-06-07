package DesignPattern.Observer;

import DesignPattern.Observer.imp.Phone;
import DesignPattern.Observer.imp.WeatherStation;
import DesignPattern.Observer.imp.Website;
import DesignPattern.Observer.imp.Windows;

public class main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Phone p1 = new Phone(weatherStation);
        Windows w1 = new Windows(weatherStation);
        Website we1 = new Website(weatherStation);

        weatherStation.add(p1);
        weatherStation.add(w1);
        weatherStation.add(we1);

        weatherStation.notifyUpdate();
        weatherStation.changeTemp();
        weatherStation.notifyUpdate();

    }
}
