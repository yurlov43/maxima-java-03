package org.example;

import java.util.ArrayList;

public class StackKitchen<T> implements AnimalKitchen<T> {
    private ArrayList<T> animals;

    public StackKitchen() {
        this.animals = new ArrayList<>();
    }

    @Override
    public void add(T animal) {
        getAnimals().add(animal);
    }

    @Override
    public void feed() {
        int length = getAnimals().size();
        if (length > 0) getAnimals().remove(length - 1);
    }

    public ArrayList<T> getAnimals() {
        return animals;
    }
}
