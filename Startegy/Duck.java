package DesignPattern.Startegy;

import DesignPattern.Startegy.Interface.IDisplayBehavior;
import DesignPattern.Startegy.Interface.IFlyBehavior;

public class Duck  implements IFlyBehavior, IDisplayBehavior{
    /*
    * fly
    * display
    * */
    IDisplayBehavior iDisplayBehavior;
    IFlyBehavior iFlyBehavior;

    Duck(IDisplayBehavior iDisplayBehavior, IFlyBehavior iFlyBehavior){
        this.iDisplayBehavior = iDisplayBehavior;
        this.iFlyBehavior = iFlyBehavior;
    }

    @Override
    public void display() {
            this.iDisplayBehavior.display();
    }

    @Override
    public void fly() {
    this.iFlyBehavior.fly();
    }
}
