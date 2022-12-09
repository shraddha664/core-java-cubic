package org.example.collectionframeworks;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("saru");
        list.add("abc");
        list.add("ram");

        for (String Students:list){
            System.out.println(Students);
        }
    }
}
