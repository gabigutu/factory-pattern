package com.factory;

public class Main {

    // Factory Design Pattern

    public static void main(String[] args) {
	    ACME acme = new ACME();
	    Item item = acme.createItem(ItemType.PEN);
	    item.isCreated();
        ((Pen) item).writes();
        item.isTrashed();

        item = acme.createItem(ItemType.PAVLOVA_CAKE);
        item.isCreated();
        ((Cake) item).isEaten();
        item.isTrashed();

        item = acme.createItem(ItemType.NOTHING);
        item.isCreated();
        ((EmptyItem) item).nothing();
        item.isTrashed();

        item = acme.createItem(ItemType.CHAIR);
        item.isCreated();
        item.exists();
        ((Chair) item).isOccupiedBy("Vasilica");
        item.isTrashed();
    }
}
