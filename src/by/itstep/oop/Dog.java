package by.itstep.oop;

public class Dog {

    private String name;
    private long id;
    private String type;
    private char gender;
    private int age;
    private double w;
    private double h;

    //Getters && Setters
    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge){
        if(newAge < 0){
            System.out.println("Incorrect age: " + newAge);
        }
        else {
            age = newAge;
        }
    }
    public char getGen(){
        return gender;
    }
    public void setGen(char gen){
        gender = gen;
    }
}
class DogTester{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Tuzik");

        dog.setAge(-2);

        dog.setGen('f');
        char g = dog.getGen();



        System.out.println("Dog name is " + dog.getName());
        System.out.println("dog age is " + dog.getAge());
        System.out.println("gander dog is " + g);

    }
}