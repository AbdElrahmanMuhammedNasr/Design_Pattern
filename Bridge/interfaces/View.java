package DesignPattern.Bridge.interfaces;

public abstract class View {
    Resource resource;
   public View(Resource resource){
        this.resource = resource;
    }
    public abstract void show();
}
