package by.itstep.oop.patterns.factjrymethod;

public abstract class Pizza {
    public abstract void printInfo();
}
class Margarita extends Pizza{
    public void printInfo(){
        System.out.println("pizza margarita");
    }
}
class Rustic extends Pizza{
    public void printInfo(){
        System.out.println("pizza rustic");
    }
}
class Pepperoni extends Pizza{
    public void printInfo(){
        System.out.println("pizza pepperoni");
    }
}
class Pizzeria {
    public static Pizza makePizza(int key) {
        switch (key) {
            case 1:
                return new Margarita();
            case 2:
                return new Rustic();
            case 3:
                return new Pepperoni();
            default:
                throw new IllegalArgumentException("No such delivery type");

        }
    }
}
class pizzaClient{
    public static void main(String[] args) {
        Pizza p1 = Pizzeria.makePizza(2);
        p1.printInfo();

        Pizza[] pizzas = {Pizzeria.makePizza(1),Pizzeria.makePizza(2),Pizzeria.makePizza(3)};

    }
}