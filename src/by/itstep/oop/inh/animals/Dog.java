package by.itstep.oop.inh.animals;

public class Dog extends DAnimal {
    @Override
    void sleep(){
        super.sleep();
    }

    @Override
    void eat() {
        System.out.println(getName() + " eat -> meat");
    }

    @Override
    void play() {
        super.play();
    }

    @Override
    void voice() {
        System.out.println("same voice haw haw");
    }


    void serve(){
        System.out.println(getName() + " serves his master");
    }
}
