package org.example.HomeWork16082024;

import java.util.*;

public class SortList16082024 {
    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 500; i++) {
            int element = random.nextInt(10);
            list.add(element);
        }
        Set<Integer> uniqueElements = new HashSet<>(list);
        System.out.println("Набор уникальных элементов: " + uniqueElements);

        List<Integer> sortedUniqueElements = new ArrayList<>(uniqueElements);
        Collections.sort(sortedUniqueElements);

        System.out.println("Отсортированный набор уникальных элементов: " + sortedUniqueElements);
    }
}