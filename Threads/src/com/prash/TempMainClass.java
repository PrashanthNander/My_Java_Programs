package com.prash;

public abstract class TempMainClass {
    TempMainClass() {
        System.out.println("Abstract Class Constructor");
    }

    abstract void run();
    void change() {
        System.out.println("Change method invoked");
    }
}

class testAbstract extends TempMainClass {

    void run() {
        System.out.println("Run method is implemented");
    }
    public static void main(String[] args) {
        TempMainClass test = new testAbstract();
        test.run();
        test.change();

    }
}
