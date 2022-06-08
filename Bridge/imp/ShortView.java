package DesignPattern.Bridge.imp;

import DesignPattern.Bridge.interfaces.Resource;
import DesignPattern.Bridge.interfaces.View;

public class ShortView extends View {
        Resource resource;
    public ShortView(Resource resource){
        super(resource);
        this.resource = resource;
    }
    @Override
    public void show() {
        System.out.println("short view");
        this.resource.title();
        this.resource.views();

    }
}
