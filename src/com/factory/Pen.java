package com.factory;

public class Pen extends WritingItem {
    @Override
    public void isTrashed() {
        System.out.println("A pen is trashed");
    }

    @Override
    public void writes() {
        System.out.println("A pen writes");
    }
}
