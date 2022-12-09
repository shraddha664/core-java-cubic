package org.example.downcasting.upcasting;

public class CastingDemo {
    public static void main(String[] args) {
//        upcasting
        Parent p=new Child();
        p.name="Saru";
        System.out.println(p.name);
        p.method();
//        p.show();
//downcasting

Child c=(Child) p;
c.id=2;
c.method();
        System.out.println(c.id);
        System.out.println(c.name);

//        Child cd=new Parent(); this cant be done
    }
}
class Parent{
    String name;
    void method(){
        System.out.println("method from parent");
    }
}
class Child extends Parent{
    int id;
    void method(){
        System.out.println("method of child");
    }
    void show(){
        System.out.println("hey this is child class");
    }
}
