package com.factory;

public abstract class Cake extends Item {


    @Override
    public void isCreated() {
        System.out.println("A cake is created");
    }

    @Override
    public void isTrashed() {
        System.out.println("A cake is trashed");
    }

    public abstract void isEaten();

}
