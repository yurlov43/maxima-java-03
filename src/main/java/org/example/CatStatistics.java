package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CatStatistics {

    public static ArrayList<Cat> sortByNameAscending(ArrayList<Cat> cats) {
        return cats.stream()
                .sorted(Comparator.comparing(Cat::getName))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static ArrayList<Cat> sortByWeightDescending(ArrayList<Cat> cats) {
        return cats.stream()
                .sorted((cat1, cat2) -> cat2.getWeight() - cat1.getWeight())
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static ArrayList<Cat> removeFirstAndLast(ArrayList<Cat> cats) {
        return cats.stream()
                .limit(cats.size() - 1)
                .skip(1)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static Cat findFirstNonAngryCat(ArrayList<Cat> cats) {
        return cats.stream()
                .dropWhile(Cat::isAngry)
                .findFirst()
                .orElse(null);
    }

    public static int getCommonWeight(ArrayList<Cat> cats, boolean onlyAngry) {
        return onlyAngry ?
                cats.stream().filter(Cat::isAngry).map(Cat::getWeight).reduce(Integer::sum).orElse(0) :
                cats.stream().map(Cat::getWeight).reduce(Integer::sum).orElse(0);

    }

    public static Map<String, List<Cat>> groupCatsByFirstLetter(ArrayList<Cat> cats) {
        return cats.stream().collect(
                Collectors.groupingBy(
                        cat -> cat.getName().substring(0,1),
                        Collectors.toCollection(ArrayList::new)));
    }
}
