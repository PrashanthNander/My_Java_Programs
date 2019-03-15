package com.prash;

public class ThreadCreationOne extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I am in ThreadCreationOne Class");
    }
}
