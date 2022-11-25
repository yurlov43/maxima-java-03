package org.example;


public class App 
{
    public static void main( String[] args ) throws IncorrectCatWeightException {
        Cat mursik = CatFactory.createCat("Mursik", -3);
        System.out.println(mursik);

        Cat barsik = CatFactory.createCat("Barsik", 10);
        System.out.println(barsik);
    }
}
