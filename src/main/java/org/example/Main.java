package org.example;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
//        String str="hello";
//        System.out.println(str);
//        str=str+"hi";
//
//        System.out.println(str);
//        System.out.println("string immutable example");
//        //dont give string to concatinate as string is immutable
//        str.concat("how r u");
//
//        System.out.println(str);
//        System.out.println(str.charAt(2));
//
//        str="hello hi hi";
//        System.out.println(str);
//String str1 ="hello000";
//        System.out.println(str1);

        //using the StringBuilder() constructor
//        StringBuilder stb=new StringBuilder();
//        stb.append("mutability");
//        System.out.println("string="+stb.toString());

        //using the StringBuilder(charsequence seq) constructor
//        StringBuilder stb1=new StringBuilder("Java");
//        System.out.println("string1="+stb1.toString());

        //using the stringbuilder(int capacity) constructor
//        StringBuilder stb2=new StringBuilder(1);
//        System.out.println("string2 capacity="+stb2.capacity());
//stb2.append("hi this is me  fdhg dgdkgdg dk gdkbgdk gdfkgdfkg dkgdkg");
//        Syste m.out.println("new string="+stb2);

//        //using the stringbuilder(string) constructor
//        StringBuilder stb3=new StringBuilder(stb);
//        System.out.println("string3="+stb.toString());

        Student std=new Student("Saru",2);

        //if there is no any toString() defined in student class which is
        // known as averriding tostring() then printing the java object
        // internally invokes the tostring() which in turn return the
        // classname@memorylocation of object.So,in order to get the
        // desired output tostring() should be overriden


//        System.out.println(std);

        //displays the default thread created by jvm which is main thread
//        System.out.println(Thread.currentThread().getName());


//        ThreadClass threadClass=new ThreadClass();
//        threadClass.start();
//
//        for (int i=0;i<100;i++){
//            System.out.println("Iam a Main thread");
//        }

    }
}