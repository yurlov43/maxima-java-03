package org.example;

public class StackKitchen<T> extends AbstractKitchen<T> {

    public void feed() {
        int length = getAnimals().size();
        if (length > 0) getAnimals().remove(length - 1);
    }
}
