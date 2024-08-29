package org.example.HomeWork16082024.randomlines;

import java.util.HashSet;
import java.util.Set;

public class RandomLines16082024 {
    public static void main(String[] args) {
        String str1 = "ar45%opn12bc?[]qzykhjo0";
        String str2 = "a5rn/?'k[]p00)9safxcgfteiuuijjojwftfwtfygubzvkkoi";

        String combinetStr = str1 + str2;

        Set<Character> set1 = new HashSet<>();
        for (char i : str1.toCharArray()) {
            set1.add(i);
        }
        Set<Character> set2 = new HashSet<>();
        for (char i : str2.toCharArray()) {
            set2.add(i);
        }
        Set<Character> uniqueChars = new HashSet<>(set1);

        uniqueChars.addAll(set2);
        uniqueChars.removeAll(set1);

        for (char i : uniqueChars) {
            System.out.print(i + " ");
        }
    }
}




