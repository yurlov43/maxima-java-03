package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextTransformer implements Transformable {
    @Override
    public void transform(String fileIn, String fileOut) throws IOException {
        FileReader fileReader = new FileReader(fileIn);
        BufferedReader reader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter(fileOut);
        String line = reader.readLine();

        while(line != null) {
            String[] words = line.split(";");
            String resultString = buildString(words);
            fileWriter.write(resultString);
            line = reader.readLine();
        }

        fileReader.close();
        fileWriter.flush();
        fileWriter.close();
    }

    private String buildString(String[] words) {
        String name = words[0];
        String weight = words[1];
        String isAngry = identifyAnger(words[2]);
        return isAngry + " кот " + name + " весом " + weight + "кг.\n";
    }

    private String identifyAnger(String word) {
        if (word.equals("true")) return "Сердитый";
        return "Дружелюбный";
    }
}
