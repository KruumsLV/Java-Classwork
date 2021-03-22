package com.rcs.classwork.Day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ReplaceListItems {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        Random random = new Random();

        // 1.) Nejauši izvēlēties saraksta garumu
        // Random, robežās no 5 līdz 20 ieskaitot (N)
        int n = random.nextInt(16) + 5;

        // 2.) Pieškirat numberList sarakstam N elementus
        // kur vērtības ir Random, robežās no 0 līdz 100 ieskaitot.
        // * Izvadām saraksta vērtības uz ekrāna (vienā rindā)
        for(int i = 0; i < n; i++) {
            int number = random.nextInt(101);
            numberList.add(number);
            System.out.printf("%4d ", number);
        }
        System.out.println();

        // 3.) Cikliski iziet cauri numberList sarakstam
        // un vērtibas, kas ir robežās no 0 līdz 39, aizstāt ar 0
        // numberList.set(index, newValue)

        // 4.) Izvadām saraksta vērtības uz ekrāna (vienā rindā)
        for(int i = 0; i < numberList.size(); i++) {
            if(numberList.get(i) <= 39) {
                numberList.set(i, 0);
            }
            System.out.printf("%4d ", numberList.get(i));
        }
    }
}
