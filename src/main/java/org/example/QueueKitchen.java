package org.example;

public class QueueKitchen<T> extends Kitchen<T> {

    public QueueKitchen() {
        super();
    }

    public void feed() {
        int length = getAnimals().size();
        if (length > 0) getAnimals().remove(0);
    }
}
