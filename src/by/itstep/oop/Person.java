package by.itstep.oop;

//class <=> model <=> type <=> template

public class Person {

    //field - поля.характеристики обьектов.
    int age;
    String name;
    String lastName;//
    char ch;// can be 'f' , 'm'
    Boolean isSingle;
    // methods <=> function
    void sayMyName(){
        System.out.println("Hello , my name is " + name);
    }

    void dance(){
        System.out.println("and dance");
    }

    void drink(){
        if(age>=18){
            System.out.println("i drink vodka");
        }
        else{
            System.out.println(" i do not drink alcohol");
        }
    }
    void marry(){
        isSingle = false;
    }
    void journey(){
        if(age >=18 || isSingle == true ){
            System.out.println("I will travel alone");
        }
        else if (age <18){
            System.out.println("I will travel with my parents");
        }
        else if (age >=18 || isSingle == false){
            System.out.println("I'll travel with my beloved");
        }
    }

}

class Tester{
    public static void main(String[] args) {
        // создание переменной типа Person
        Person person;
        Person person1;
        Person person2;
        // instance creation <=> object creation , via 'new' operator
        person = new Person();
        person1 = new Person();
        person2 = new Person();
        //instance fields initialisation <=> object population

        person.name = "John";
        person.age = 32;
        person.ch = 'm';
        person.isSingle  = true;
        person.lastName = "Johnson";


        person1.name = "Anna";
        person1.age = 15;
        person1.ch = 'f';
        person1.isSingle  = true;
        person1.lastName = "Johnson";


        person2.name = "Angelina";
        person2.age = 29;
        person2.ch = 'f';
        person2.isSingle  = true;
        person2.lastName = "Johnson";

        //object behavior <=> method invocation
        person.sayMyName();
        person.drink();
        person.dance();

        person1.sayMyName();
        person1.drink();
        person1.dance();

        person2.sayMyName();
        person2.drink();
        person2.dance();
        person2.dance();
        person2.dance();



    }
}
