package DesignPattern.Bridge.imp;

import DesignPattern.Bridge.interfaces.Resource;
import DesignPattern.Bridge.interfaces.View;

public class LongView extends View {

    Resource resource;
    public LongView(Resource resource){
        super(resource);
        this.resource = resource;
    }
    @Override
    public void show() {
        System.out.println("long view");
        this.resource.title();
        this.resource.views();
    }
}
