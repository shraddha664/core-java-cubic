package org.example.collectionframeworks;

import java.util.*;

public class SetInterfaceDemo {
    public static void main(String[] args) {
        Set<Integer> values=new HashSet<>();
        System.out.println( values.add(4));
        System.out.println(values.add(2));
        System.out.println( values.add(10));
        System.out.println(values.add(2));

        for (int i:values){
            System.out.println(i+" ");
        }

        Set<Integer> values1=new TreeSet<>();
        System.out.println( values1.add(4));
        System.out.println(values1.add(2));
        System.out.println( values1.add(10));
        System.out.println(values1.add(2));

        for (int i:values1){
            System.out.println(i+" ");
        }

        HashSet<Integer>hashSet=new HashSet<>();
        hashSet.add(13);
        hashSet.add(1);
        hashSet.add(2);
        System.out.println(hashSet);
        System.out.println(hashSet.toArray());

        Object[] h=hashSet.toArray();
        System.out.println(h[0]);

        Iterator<Integer> iterator=hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        hashSet.clear();
        System.out.println(hashSet);


        HashMap<String,Integer> empIds=new HashMap<>();
        empIds.put("john",12);
        empIds.put("saru",122);
        empIds.put("dilu",312);
        empIds.put("ram",0102);
        System.out.println(empIds);
        System.out.println(empIds.get("saru"));
        System.out.println(empIds.containsKey("ram"));
        System.out.println(empIds.containsValue(2));
        empIds.put("john",234);
        System.out.println(empIds);
       Set<String > k=empIds.keySet();
       for (String ke:k){
           System.out.println(ke+" "+empIds.get(ke));
       }

    }
}
