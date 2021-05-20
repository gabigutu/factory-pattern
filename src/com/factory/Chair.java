package com.factory;

public class Chair extends Item {

    @Override
    public void isCreated() {
        System.out.println("A chair is created");
    }

    public void isOccupiedBy(String name) {
        System.out.println("A chair is occupied by " + name);
    }

    @Override
    public void isTrashed() {
        System.out.println("A chair is trashed");
    }
}
