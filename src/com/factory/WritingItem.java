package com.factory;

public abstract class WritingItem extends Item {

    @Override
    public void isCreated() {
        System.out.println("A writing item is created");
    }

    public abstract void isTrashed();
    public abstract void writes();

}
