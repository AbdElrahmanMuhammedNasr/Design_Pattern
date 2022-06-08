package DesignPattern.Bridge.imp;

import DesignPattern.Bridge.interfaces.Resource;

public class Artist implements Resource {
    @Override
    public void title() {
        System.out.println("artist title");
    }

    @Override
    public void views() {
        System.out.println("artist views");

    }
}
