package by.itstep.oop.patterns.factjrymethod;

public abstract class Transport {

    public abstract void deliver();

}
class Plane extends Transport{
    @Override
    public void deliver(){
        System.out.println("fly delivery");
    }
}
class Truck extends  Transport{
    @Override
    public void deliver(){
        System.out.println("road delivery");
    }
}

class Ship extends Transport{
    @Override
    public void deliver(){
        System.out.println("sea delivery");
    }
}
class FactoryMethodPattern {
    public static Transport getTransport(int key){
        switch (key) {
            case 1 :
                return new Plane();
            case 2 :
                return new Truck();
            case 3 :
                return new Ship();
            default:
                throw new IllegalArgumentException("No such delivery type");

        }
    }
    public static Transport getTransport(String type){
        switch (type) {
            case "Plane" :
                return new Plane();
            case "Truck" :
                return new Truck();
            case "Ship" :
                return new Ship();
            default:
                throw new IllegalArgumentException("No such delivery type");

        }
    }
}

class Client{
    public static void main(String[] args) {
        Transport tr1 = FactoryMethodPattern.getTransport("Ship");
        tr1.deliver();

        Transport tr2 = FactoryMethodPattern.getTransport(2);
        tr2.deliver();
    }
}