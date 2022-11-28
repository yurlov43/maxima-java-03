package org.example;

public class StackKitchen<T> extends Kitchen<T> {

    public StackKitchen() {
        super();
    }

    public void feed() {
        int length = getAnimals().size();
        if (length > 0) getAnimals().remove(length - 1);
    }
}
