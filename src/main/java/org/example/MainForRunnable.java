package org.example;

public class MainForRunnable {
    public static void main(String[] args) {
        RunnableDemo runnableDemo = new RunnableDemo();

        Thread thread = new Thread(runnableDemo);
        thread.start();

        for (int i=0;i<100;i++){
            System.out.println("Iam a Main thread");
        }
    }
}
