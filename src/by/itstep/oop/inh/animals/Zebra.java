package by.itstep.oop.inh.animals;

public class Zebra extends Mammals{
    @Override
    void eat(){
        System.out.println(getName() + " eat greenery ");
    }

    @Override
    void sleep() {
        super.sleep();
    }
    void runsAway (){
        System.out.println("running away");
    }
}
