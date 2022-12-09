package org.example.collectionframeworks;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        int count[] = {21, 23, 43, 45, 56};
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 5; i++)
            set.add(count[i]);

            System.out.println(set);

            TreeSet<Integer> sortedSet = new TreeSet<>(set);
            System.out.println("the sorted list is:");
            System.out.println(sortedSet);

            System.out.println("First element of the set is:" + sortedSet.first());
            System.out.println("last element of the set is:" + sortedSet.last());


        }
    }
