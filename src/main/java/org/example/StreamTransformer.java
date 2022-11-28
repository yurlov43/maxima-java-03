package org.example;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class StreamTransformer implements Transformable {

    @Override
    public void transform(String fileIn, String fileOut) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(fileIn);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        FileOutputStream fileOutputStream = new FileOutputStream(fileOut);

        String line = reader.readLine();

        while(line != null) {
            String[] words = line.split(";");
            String resultString = buildString(words);
            fileOutputStream.write(resultString.getBytes());
            line = reader.readLine();
        }

        fileInputStream.close();
        fileOutputStream.flush();
        fileOutputStream.close();
    }

    private String buildString(String[] words) {
        String name = words[0];
        String weight = words[1];
        String isAngry =  words[2].equals("true") ? "Сердитый" :  "Дружелюбный";
        return String.format("%s кот %s весом %sкг.\n", isAngry, name, weight);
    }
}
