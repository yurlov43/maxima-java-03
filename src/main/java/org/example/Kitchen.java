package org.example;

import java.util.ArrayList;

abstract public class Kitchen<T> implements AnimalKitchen<T> {

    private final ArrayList<T> animals;

    public Kitchen() {
        this.animals = new ArrayList<>();
    }
    @Override
    public void add(T animal) {
        getAnimals().add(animal);
    }

    @Override
    abstract public void feed();

    public ArrayList<T> getAnimals() {
        return animals;
    }
}
