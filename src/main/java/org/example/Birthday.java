package org.example;

import java.time.LocalDate;

public class Birthday {

    static int getAge(int year, int month, int date) {
        LocalDate actualDate = LocalDate.now();
        LocalDate birthDate = LocalDate.of(year, month, date);
        return (int)(actualDate.toEpochDay() - birthDate.toEpochDay());
    }

    static LocalDate nextBirthday(int year, int month, int date) {
        int numberDays = getAge(year, month, date);
        int remainingDays = 1000 - numberDays % 1000;
        return LocalDate.now().plusDays(remainingDays);
    }
}
