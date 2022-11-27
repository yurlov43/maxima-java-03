package org.example;


import java.io.IOException;

public class App
{
    public static void main( String[] args ) throws IncorrectCatWeightException, IOException {
        TextTransformer textTransformer = new TextTransformer();
        textTransformer.transform("catsInfo.csv", "catsInfo.txt");
    }
}
