package org.example.exceptions.in.java;

import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number:");
        int num=scanner.nextInt();
        int result=0;
        try{
            result=100/num;
            System.out.println("Try block result is:"+result);
            System.exit(5);
        }catch (Exception e){
            System.out.println(e.getMessage());

        }finally {
            System.out.println("This is finally block");

        }
        System.out.println("Last line of main function");

    }
}
