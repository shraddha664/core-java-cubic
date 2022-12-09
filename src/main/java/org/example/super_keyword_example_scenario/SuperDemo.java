package org.example.super_keyword_example_scenario;
class Vehicle{
    int maxSpeed;
    Vehicle(int maxSpeed){
        this.maxSpeed=maxSpeed;
    }
    void display(){
        System.out.println("Speed of Vehicle:"+maxSpeed);
    }
    void show(){
        System.out.println("hey this is Vehicle class");
    }
}
class Car extends Vehicle{
    int maxSpeed=180;
//    super with constructor
    Car(int maxSpeed,int parentSpeed){
        super(parentSpeed);
        this.maxSpeed=maxSpeed;
    }
    void show(){
        System.out.println("hey this is car class");
    }
    void display(){
//        super with function
        super.display();
        show();
        super.show();
//        super with variable
        int totalSpeed=maxSpeed+super.maxSpeed;
        System.out.println("maximum spped:"+totalSpeed);
    }
}

public class SuperDemo {

    public static void main(String[] args) {
        Car small=new Car(120,180);
        small.display();

    }
}
