package DesignPattern.Singlton;

public class main {
    public static void main(String[] args) {
        SingletonClass s = SingletonClass.getInstance();
        s.print();
        System.out.println(s.hashCode());

        SingletonClass s1 = SingletonClass.getInstance();
        s1.print();
        System.out.println(s1.hashCode());
    }
}
