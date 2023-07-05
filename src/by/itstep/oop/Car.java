package by.itstep.oop;

import by.itstep.MathUtil;

public class Car {

    double vEngine;
    String model;
    String color;
    String vinCode;
    int hp;
    int numberOfSeats;

    int numberOfGears;
    int currentGear;

    int maxSpeed;
    int currentSpeed;






    void acceleration() throws InterruptedException {
        while (currentSpeed <= maxSpeed){
            switchGearUp();
            Thread.sleep(500);
            int temp = MathUtil.genRandom(10, 40);
            currentSpeed += temp;
            System.out.println("Current speed is " + currentSpeed);
        }
    }

    void switchGearUp(){
        if(numberOfGears > currentGear){
            currentGear++;
            System.out.println("Current gear UP: " + currentGear);
        } else {
            System.out.println("Max gear number is reached");
        }

    }

    void switchGearDown(){
        if(currentGear >= 1){
            currentGear--;
            System.out.println("Current gear DOWN: " + currentGear);
        } else {
            System.out.println("Min gear number is reached");
        }
    }

}

class CarTester {
    public static void main(String[] args) throws InterruptedException {
        Car car = new Car();
        car.color = "Black";
        car.model = "BMW M5";
        car.numberOfGears = 6;
        car.maxSpeed = 250;
        car.currentSpeed = 0;
        car.currentGear = 0;

        car.acceleration();
    }
}