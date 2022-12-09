package org.example;

public class ToStringDemo {
    public static void main(String[] args) {
StudentDemo student=new StudentDemo("saru",24);

//this is equivalent to student.toString()
System.out.println(student);
//or System.out.println(student.toString());
    }
}

//Every class implicitly extends Objects class which contains toString()
class StudentDemo{
    String name;

    int rollno;

    public StudentDemo(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
//    if we donot define toString method it generally calls implicitly and return the classname along with the address
//    so to get specific o/p need to override the method
    public String toString(){
        return name+" "+rollno;
    }
}
