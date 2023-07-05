package by.itstep.oop.inh.animals;

public class Cat extends Mammals {
    @Override
    void sleep(){
        super.sleep();
        super.sleep();
        super.sleep();
    }
    @Override
    void eat(){
        System.out.println(getName() + " eat()");
    }
    @Override
    void play() {
        System.out.println(getName() + " playing with mouse ");
    }

    @Override
    void voice() {
        System.out.println("same voice mew mew");
    }
}
