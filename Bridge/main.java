package DesignPattern.Bridge;

import DesignPattern.Bridge.imp.Artist;
import DesignPattern.Bridge.imp.LongView;
import DesignPattern.Bridge.imp.ShortView;
import DesignPattern.Bridge.interfaces.Resource;
import DesignPattern.Bridge.interfaces.View;

public class main {
    public static void main(String[] args) {
        Resource r = new Artist();
        View x = new LongView(r);
        View x1 = new ShortView(r);
        x.show();
        x1.show();
    }
}
