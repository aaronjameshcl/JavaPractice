package com.company;

class vehicle {
    public int fuel = 0;
    public int size = 10;
    public int odometer = 0;
    public int mileage = 10;
    public void fill(){
        fuel = size;
        System.out.println("This vehicle has been fully filled.");
        fuelStatus();
    }
    public void fuelStatus() {
        System.out.println("This vehicle has " + fuel + " units of fuel left in it.");
    }
    public void go(){
        fuel--;
        odometer += mileage;
    }
    public void empty() {
        int count = 0;
        while(fuel != 0) {
            go();
            count++;
        }
        System.out.println("This vehicle went " + (count * mileage) + " miles before stopping. Its odometer reads " + odometer + " miles.");
    }
}

class gasCar extends vehicle {
    public int size = 14;
    public int odometer = 0;
    public int mileage = 20;
    public void fill(){
        fuel = size;
        System.out.println("This gas car has been fully filled.");
        fuelStatus();
    }
    public void fuelStatus(){
        System.out.println("This gas car has " + fuel + " gallons of gas left in its " + size + " gallon tank.");
    }
    public void go(){
        fuel--;
        odometer += mileage;
    }
    public void empty() {
        int count = 0;
        while(fuel != 0) {
            go();
            count++;
        }
        System.out.println("This gas car went " + (count * mileage) + " miles before stopping. Its odometer reads " + odometer + " miles.");
    }
}

class electricCar extends vehicle {
    public int size = 50;
    public int odometer = 0;
    public int mileage = 5;
    public void fill(){
        fuel = size;
        System.out.println("This electric car has been fully recharged.");
        batteryStatus();
    }
    public void batteryStatus(){
        System.out.println("This electric car has " + fuel + " kWh of charge left in its " + size + " kWh battery.");
    }
    public void go(){
        fuel--;
        odometer += mileage;
    }
    public void empty() {
        int count = 0;
        while(fuel != 0) {
            go();
            count++;
        }
        System.out.println("This electric car went " + (count * mileage) + " miles before stopping. Its odometer reads " + odometer + " miles.");
    }
}

public class Main {

    public static void main(String[] args) {
        vehicle car = new vehicle();
        car.fill();
        car.empty();
        gasCar camry = new gasCar();
        camry.fill();
        camry.empty();
        electricCar tesla = new electricCar();
        tesla.fill();
        tesla.empty();
        car.fill();
        car.empty();
        camry.fill();
        camry.empty();
    }
}
