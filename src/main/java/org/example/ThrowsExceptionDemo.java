package org.example;


import java.util.Scanner;

public class ThrowsExceptionDemo {
    public static String demo() throws Exception{
        System.out.println("enter ny name:");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        if (name.equals("saru")){
            throw new Exception("exception caught :name saru");

        }else {
            return name ;
        }

    }
    public static void main(String[] args) {
        try {
           String name1=demo();
            System.out.println("Welcome:"+name1);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
