package com.prash;


class Car {
    private boolean engine;
    private int noOfCylinders;
    private int noOfWheels;
    private String nameOfTheCar;

    public Car(String engine, int noOfCylinders, String nameOfTheCar) {
        this.engine = true;
        this.noOfCylinders = noOfCylinders;
        this.nameOfTheCar = nameOfTheCar;
        this.noOfWheels = 4;
    }

    public String startEngine() {
        return ("No engine to be started here");
    }

    public String accelarate() {
        return("Nothing to accelarate");
    }

    public String applyBrake() {
        return("Nothing to apply brake");
    }

    public int getNoOfCylinders() {
        return noOfCylinders;
    }

    public String getNameOfTheCar() {
        return nameOfTheCar;
    }
}

class Benz extends Car {
    public Benz() {
        super("true",4,"Benz");
    }
}

class BMW extends Car {
    BMW() {
        super("true",2,"BMW");
    }

    public String accelarate(){
        return ("Acclerating BMZ");
    }
    public String startEngine(){
        return("BMW Engine Started");
    }
}

class Jaguar extends Car {
    Jaguar(){
        super("true",2,"Jaguar");
    }

    public String accelarate(){
        return("Acclerating Jaguar");
    }
    public String startEngine(){
        return("Jaguar Engine Started");
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i=0 ; i<5 ; i++ ) {
            Car car = randomCar();
            System.out.println("Car #" + i+ ":" + car.getNameOfTheCar() + " : ");
            System.out.println("Car # " + car.accelarate());
        }
    }

    public static Car randomCar() {
        int randomNum = (int)(Math.random() * 5) + 1;
        System.out.println("Random number generated : " + randomNum);
        switch(randomNum) {
            case 1:
                return new Benz();
            case 2:
                return new BMW();
            case 3:
                return new Jaguar();

        }
        return new Benz();
    }
}

