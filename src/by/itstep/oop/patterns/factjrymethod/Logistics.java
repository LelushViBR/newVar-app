package by.itstep.oop.patterns.factjrymethod;

public abstract class Logistics {
    abstract void planeDelivery();
    abstract Transport createTransport();
}

class SeaLogistics extends Logistics{
    @Override
    void planeDelivery(){
        System.out.println();
    }

    @Override
    Transport createTransport() {
        return new Ship();
    }
}
class FlyLogistics extends Logistics{
    @Override
    void planeDelivery(){

    }

    @Override
    Transport createTransport() {
        return new Plane();
    }
}
class RoadLogistics extends Logistics {
    @Override
    void planeDelivery() {

    }

    @Override
    Transport createTransport() {
        return new Truck();
    }
}


class LogisticsProvider {
     public static Logistics chooseLogistics(String type){
        switch (type) {
            case "AIR":
                return new FlyLogistics();
            case "SEA":
                return new SeaLogistics();
            case "ROAD":
                return new RoadLogistics();
            default:
                return new RoadLogistics();
        }
     }
}
class LogisticClient{
   public static void main(String[] args) {
        Logistics l =  LogisticsProvider.chooseLogistics("ROAD");
        l.createTransport();
    }
}
