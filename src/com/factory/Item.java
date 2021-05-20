package com.factory;

public abstract class Item {

    public void exists() {
        System.out.println("An item exists");
    }

    public abstract void isCreated();
    public abstract void isTrashed();

}
