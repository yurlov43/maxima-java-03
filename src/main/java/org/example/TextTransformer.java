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
        String isAngry =  words[2].equals("true") ? "Сердитый" :  "Дружелюбный";
        return String.format("%s кот %s весом %sкг.\n", isAngry, name, weight);
    }
}
