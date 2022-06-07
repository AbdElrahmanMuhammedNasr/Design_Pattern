package DesignPattern.Observer.interfaces;

public interface IObservable {

    void add(IObserver iObserver);
    void remove(IObserver iObserver);
    void notifyUpdate();
}
