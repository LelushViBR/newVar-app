package by.itstep.oop.casting;

public class Rectangle extends Shape{
    private double a,b;

    public Rectangle(double a) {
        this.a = a;
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle() {

    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public void print() {
        System.out.println("_________");
        System.out.println("|        |" );
        System.out.println("|        | " );
        System.out.println("|        |" );
        System.out.println("_________" );
    }

    @Override
    public void calculateP() {
        double p = 2 * ( a + b );
        setP(p);
    }

    @Override
    public void calculateS() {
        double s = a * b;
        setS(s);
    }
}
