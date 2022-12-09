package org.example.muliple_inheritance_with_interface;

interface AnimalEat{
    void eat();
}
interface AnimalTravel{
    void travel();
}
class Animal implements AnimalEat, AnimalTravel{
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void travel(){
        System.out.println("Animal can travel");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.eat();
        a.travel();
    }
}
