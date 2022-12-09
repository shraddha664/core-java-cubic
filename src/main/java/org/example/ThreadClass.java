package org.example;

public class ThreadClass extends Thread{

    @Override
    public void run(){

        for (int i=0;i<100;i++){
            System.out.println("Iam a child thread");
        }
    }
}
