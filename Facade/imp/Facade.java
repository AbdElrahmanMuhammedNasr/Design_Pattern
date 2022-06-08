package DesignPattern.Facade.imp;

import DesignPattern.Facade.interfaces.Mobile;

public class Facade {
    private Mobile iphone;
    private Mobile samsung;
    private Mobile oppo;

    public Facade(){
        iphone= new Iphone();
        samsung=new Samsung();
        oppo=new Oppo();
    }
    public void iphoneSale(){
        iphone.modelNo();
        iphone.price();
    }
    public void samsungSale(){
        samsung.modelNo();
        samsung.price();
    }
    public void oppoSale(){
        oppo.modelNo();
        oppo.price();
    }
}
