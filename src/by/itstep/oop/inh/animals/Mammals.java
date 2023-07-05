package by.itstep.oop.inh.animals;

public class Mammals extends Animal {
    void sleep(){
        System.out.println(getName() + " is sleeping .....ZzZZ");
    }

    void eat(){
        System.out.println(getName() + " eat()");
    }
    void play(){
        System.out.println(getName() + " play()");
    }
    void voice(){
        System.out.println("same voice.. " );
    }
}
