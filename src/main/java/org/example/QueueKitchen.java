package org.example;

import java.util.ArrayList;

public class QueueKitchen<T> implements AnimalKitchen<T> {
    private ArrayList<T> animals;

    public QueueKitchen() {
        this.animals = new ArrayList<>();
    }

    @Override
    public void add(T animal) {
        getAnimals().add(animal);
    }

    @Override
    public void feed() {
        int length = getAnimals().size();
        if (length > 0) getAnimals().remove(0);
    }

    public ArrayList<T> getAnimals() {
        return animals;
    }
}
