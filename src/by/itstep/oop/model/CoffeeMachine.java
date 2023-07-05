package by.itstep.oop.model;

import java.util.Scanner;

public class CoffeeMachine {

    private final double maxWaterTank = 1000;
    private final double MaxCoffeeTank = 1000;
    private final double maxGarbageTank = 2000;


    private static int salesCounter = 0;
    private String model;
    private int numberOfCups;
    private int currentWaterTemp;

    private boolean isAction = false;
    private boolean isOn = false;
    private double milkTank;
    private double garbageTank;

    public CoffeeMachine(String model){
        salesCounter++;
        this.model = model;
        this.numberOfCups = 0;
    }
    public void switchOn() throws InterruptedException {
        if(!isOn){
            System.out.println("CoffeeMachina" +model +" is starting ...");
            Thread.sleep(1000);
            isOn = true;
            System.out.println("CoffeeMachina" +model +" is started!!");
        }
        else {
            System.out.println("Already started");
        }
    }

    public void switchOf() throws InterruptedException {
        if (!isOn){
            System.out.println("CoffeeMachina" +model +" is stooping ..");
            Thread.sleep(1000);
            isOn = false;
            System.out.println("CoffeeMachina" +model +" is stooped!!");
        }
        else {
            System.out.println("Already stooped");
        }

    }

    private double waterTank;
    public void addWater(int extraWater){
        if (( extraWater + waterTank ) >= maxWaterTank){
            System.out.println("can't add water");
        }
        else {
            waterTank = waterTank + extraWater;
            System.out.println("current water: " + waterTank + "(ml)");
        }
    }
    private double coffeeTank;
    public void addCoffee(int extraCoffee){
        if ((extraCoffee + coffeeTank) >= maxWaterTank){
            System.out.println("can't add coffee");
        }
        else {
            coffeeTank = extraCoffee + coffeeTank;
            System.out.println("current coffee: " + coffeeTank +"mg");
        }
    }

    public void addGarbageTank(int extraGarbageTank) {
        if ((extraGarbageTank + garbageTank) >= maxWaterTank) {
            System.out.println("can't add coffee");
        } else {
            garbageTank = garbageTank + extraGarbageTank;
            System.out.println("current coffee: " + garbageTank + "ml");
        }


        //makeCupOfCoffee



    }

    public void makeCupOfCoffee(){
        if(isOn){

            if(checkGarbage(500)){
                if(waterTank >= 250 ){



                }
                else {
                    System.out.println("");

                }
            } else {
                System.out.println("need to clean up , enter 1 !");
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();


            }


        }
        else if(!isOn){
            isOn = true;
        }
    }

    private boolean checkGarbage( int value){
        return (garbageTank + value) < maxGarbageTank;
    }
    private int clearGarbage(int clearGarbage){

        return clearGarbage;
    }
}
