package org.example;


import java.io.IOException;

public class App
{
    public static void main( String[] args ) throws IncorrectCatWeightException, IOException {
        Cat c1 = new Cat("C1", 1, true);
        Cat c2 = new Cat("C2", 2,false);
        Cat c3 = new Cat("C3", 3, true);

        Dog d1 = new Dog("D1", 11, true);
        Dog d2 = new Dog("D2", 12,false);
        Dog d3 = new Dog("D3", 13, true);

        StackKitchen<Cat> stackKitchen = new StackKitchen<>();
        stackKitchen.add(c1);
        stackKitchen.add(c2);
        stackKitchen.add(c3);
        System.out.println(stackKitchen.getAnimals());
        stackKitchen.feed();
        System.out.println(stackKitchen.getAnimals());
        stackKitchen.feed();
        System.out.println(stackKitchen.getAnimals());
        stackKitchen.feed();
        System.out.println(stackKitchen.getAnimals());

        QueueKitchen<Dog> queueKitchen = new QueueKitchen<>();
        queueKitchen.add(d1);
        queueKitchen.add(d2);
        queueKitchen.add(d3);
        System.out.println(queueKitchen.getAnimals());
        queueKitchen.feed();
        System.out.println(queueKitchen.getAnimals());
        queueKitchen.feed();
        System.out.println(queueKitchen.getAnimals());
        queueKitchen.feed();
        System.out.println(queueKitchen.getAnimals());
    }
}
