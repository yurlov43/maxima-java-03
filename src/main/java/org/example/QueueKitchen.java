package org.example;

public class QueueKitchen<T> extends AbstractKitchen<T> {

    public void feed() {
        int length = getAnimals().size();
        if (length > 0) getAnimals().remove(0);
    }
}
