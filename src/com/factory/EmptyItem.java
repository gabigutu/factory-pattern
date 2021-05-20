package com.factory;

public class EmptyItem extends Item{

    @Override
    public void isCreated() {
        System.out.println("An empty item is created");
    }

    public void nothing() {
        System.out.println("An empty item does nothing");
    }

    @Override
    public void isTrashed() {
        System.out.println("An empty item is trashed");

    }
}
