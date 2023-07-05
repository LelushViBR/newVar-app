package by.itstep.oop.casting;

public class ShapesTester {

    public static void shaeTester(Shape shape){
        shape.calculateP();
        shape.calculateS();
        shape.print();
        shape.showInfo();


    }






    public static void main(String[] args) {
        Triangle t1 = new Triangle(11,9,6);
        t1.setColor("Red");
        t1.calculateP();
        t1.calculateS();
        t1.print();
        t1.showInfo();

        Circle c1 = new Circle(10);
        c1.setColor("green");
        c1.calculateP();
        c1.calculateS();
        c1.print();
        c1.showInfo();

        Rectangle r1 = new Rectangle(13,23);
        r1.setColor("blue");
        r1.calculateP();
        r1.calculateS();
        r1.print();
        r1.showInfo();

        Square s1 = new Square(2);
        s1.setColor("Red");
        s1.calculateP();
        s1.calculateS();
        s1.print();
        s1.showInfo();

        //upcasting не явный // апкастинк позволяет рассматривать  ссылкой род.класса ,тем самым функционал конкретного класса становится недоступен
        Shape sh1 = new Triangle(3,7,6);
        //upcasting явный  //instance
        Shape sh2 = (Shape) new Rectangle(53);

        Shape sh3 = new Triangle(5,7,11);
        //downCasting(всегда явная форма)(из более общего обьекта в более конкретный )
        Triangle t2 = (Triangle) sh3;
        t2.setC(9);


        Rectangle rectangle = new Rectangle(7);
        Triangle triangle = new Triangle(4,5,8);

        shaeTester(rectangle);
        shaeTester(triangle);
    }
}
