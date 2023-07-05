package by.itstep.oop;

public class Plane {

    private String type;
    private String companyName;
    private int age;
    boolean technicalInspection;
    private int numberOfSeats;
    private int numberOfPassengers;
    private int maxHeight;

    public String getCompanyName(){
        return companyName;
    }
    public void setCompanyName(String newCompanyName){
        companyName = newCompanyName;
    }
    public String getType(){
        return type;
    }
    public void setType(String newType){
        type = newType;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public void technicalInspection(boolean b ){
    }
    public int getNumberOfSeats(){
        return numberOfSeats;
    }
    public void setNumberOfSeats(int newNumberOfSeats){
        numberOfSeats= numberOfSeats;
    }
    public int getNumberOfPassengers(){
        return numberOfPassengers;
    }
    public void setNumberOfPassengers(int newNumberOfPassenger){
        numberOfSeats = newNumberOfPassenger;
    }
    public int getMaxHeight(){
        return maxHeight;
    }
    public void setMaxHeight(int newMaxHeight){
        maxHeight = newMaxHeight;
    }
    public void passabilityTechnicalInspection(){
        if (technicalInspection == true){
            System.out.println("the airplane is ready to use");
        }
        else {
            System.out.println("the airplane is not ready to use");
        }
    }

    public void fullness(){
        if (numberOfSeats == numberOfPassengers){
            System.out.println("the plane is full");
        }
        else if (numberOfPassengers < numberOfSeats){
            System.out.println("the plane is not full");
        }
        else {
            System.out.println("It can not be");
        }
    }



}
class planeTester{
    public static void main(String[] args) {
        Plane plane = new Plane();

        plane.setCompanyName("Belavia");
        plane.setType("passenger");
        plane.setAge(10);
        plane.setNumberOfSeats(250);
        plane.setNumberOfPassengers(200);
        plane.setMaxHeight(13);
        plane.technicalInspection(true);

        System.out.println("Plane Company Name is " + plane.getCompanyName());
        System.out.println("Plane type is " + plane.getType());




    }
}