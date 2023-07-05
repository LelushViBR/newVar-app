package by.itstep.oop.inh.animals;

public class Tiger extends Cat {
    @Override
    void eat() {
        System.out.println(getName()+ "eat meat");
    }
    void attack(){
        System.out.println(getName() + " attack()");
    }

}
