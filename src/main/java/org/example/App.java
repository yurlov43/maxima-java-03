package org.example;


import java.io.IOException;

public class App
{
    public static void main( String[] args ) throws IncorrectCatWeightException, IOException {
        Cat c1 = new Cat("Murka", 1, true);
        Cat c2 = new Cat("Murzik", 2,true);
        Cat c3 = new Cat("Barsik", 3, false);

        StackKitchen<Cat> stackKitchen = new StackKitchen<>();
        stackKitchen.add(c1);
        stackKitchen.add(c2);
        stackKitchen.add(c3);
        System.out.println(CatStatistics.sortByNameAscending(stackKitchen.getAnimals()));
        System.out.println(CatStatistics.sortByWeightDescending(stackKitchen.getAnimals()));
        System.out.println(CatStatistics.removeFirstAndLast(stackKitchen.getAnimals()));
        System.out.println(CatStatistics.findFirstNonAngryCat(stackKitchen.getAnimals()));
        System.out.println(CatStatistics.getCommonWeight(stackKitchen.getAnimals(), true));
        System.out.println(CatStatistics.groupCatsByFirstLetter(stackKitchen.getAnimals()));
    }
}
