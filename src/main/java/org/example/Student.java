package org.example;

public class Student {
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

public String toString(){
        return  (name+" "+id);
}
}
