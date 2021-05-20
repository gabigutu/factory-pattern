package com.factory;

enum ItemType {
    WRITING_ITEM,
    PEN,
    CAKE,
    PAVLOVA_CAKE,
    CHAIR,
    NOTHING
}

public class ACME {

    public ACME() {
    }

    public Item createItem(ItemType itemType) {
        switch (itemType) {
            case PEN:
                return new Pen();
            case PAVLOVA_CAKE:
                return new PavlovaCake();
            case CHAIR:
                return new Chair();
            default:
                return new EmptyItem();
        }
    }

}
