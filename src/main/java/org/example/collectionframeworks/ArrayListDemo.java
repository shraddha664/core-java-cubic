package org.example.collectionframeworks;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList=new ArrayList();
        System.out.println(arrayList);

//        Inserting the elements in the array list
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(4);
        System.out.println("Elements after insertion are:");
        System.out.println(arrayList);

        System.out.println("First Element is:"+arrayList.get(0));
        System.out.println("Last element is:"+arrayList.get(arrayList.size()-1));

        System.out.println("Iterating through all the elements using for each loop:");
        for (Integer num:arrayList){
            System.out.println(num);
        }
        System.out.println("Iterating through all the elements using for loop:");
        for (int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
//        Iteration using iterator
        Iterator iterator=arrayList.iterator();
        System.out.println("Iterating elements using iterator");
        while (iterator.hasNext()){
            System.out.println(iterator.next()+" ");

        }
    }
}
