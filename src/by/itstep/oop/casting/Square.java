package by.itstep.oop.casting;

public class Square extends Rectangle{
    private double a;

    public Square(double a) {
        super();
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public void print() {
        System.out.println("______");
        System.out.println("|    |" );
        System.out.println("|    |" );
        System.out.println("______" );
    }

    @Override
    public void calculateP() {
        double p = 4 * a ;
        setP(p);
    }

    @Override
    public void calculateS() {
        double s = Math.sqrt(a);
        setS(s);
    }
}
