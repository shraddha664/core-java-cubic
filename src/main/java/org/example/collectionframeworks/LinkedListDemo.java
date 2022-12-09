package org.example.collectionframeworks;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String>namesLinkedList=new LinkedList<>();
        namesLinkedList.add("john");
        namesLinkedList.add("ram");
        namesLinkedList.add("babu");
        namesLinkedList.add("hari");
        System.out.println("second index element is :"+ namesLinkedList.get(2));
namesLinkedList.add(1,"Jerry");


        ArrayList<String> newArrayList=new ArrayList<>();
        newArrayList.add("john");
        newArrayList.add("abc");
        newArrayList.add("john");
        newArrayList.add("john");
        newArrayList.add("john");
        newArrayList.add("john");
        newArrayList.add(1,"Jerry");
        System.out.println("second index element is:"+newArrayList.get(2));
    }
}
