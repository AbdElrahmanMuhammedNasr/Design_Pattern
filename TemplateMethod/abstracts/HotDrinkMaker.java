package DesignPattern.TemplateMethod.abstracts;

public abstract class  HotDrinkMaker {

    public final void operation(){
            heatWater();
            addsSuger();
            addType();
            addWater();
    }

    private void heatWater(){
        System.out.println("heat water ");
    }
    private void addsSuger(){
        System.out.println("add suger ");

    }
    protected abstract void  addType();

    private void addWater(){
        System.out.println("add water ");

    }

}
