package by.itstep.oop.casting;

import by.itstep.oop.Cat;

public class Driver {
    private char[] types;// 'A', 'B'

    public void drive (){

        System.out.println("driving ........");
    }

    public void shareDocs(){
        System.out.println("Sharing docs.....");
        for (char types: types){
            System.out.println(types);
        }
    }

    public Driver(char[] types) {
        this.types = types;
    }

    public char[] getTypes() {
        return types;
    }

    public void setTypes(char[] types) {
        this.types = types;
    }
}
class Programmer extends Driver{
    public Programmer(char[] types){
        super(types);
    }

    public void makeCode(){
        System.out.println("Coding...");
    }


}
class Student extends Driver{

    public Student(char[] types) {
        super(types);
    }

    public void learn(){
        System.out.println("Learning ....");
    }


}
class Test{

    public static void testDriver(Driver driver){
        driver.shareDocs();
        driver.drive();

        if (driver instanceof Programmer){
            Programmer p = (Programmer) driver;
            p.makeCode();
        }
        else if (driver instanceof  Student){
            Student s = (Student) driver;
            s.learn();
        }
    }


    public static void main(String[] args) {
        char [] types = {'A' , 'B'};
        Driver d = new Driver(types);

        d.drive();
        d.shareDocs();

        char[] types2 = {'B'};
        Programmer p1 = new Programmer(types2);

        p1.drive();
        p1.makeCode();
        p1.drive();
        p1.shareDocs();

        // IS - A REL
        Driver d1 = p1;
        //d1.makeCode();
        d1.shareDocs();
        // Student s1 = p1;

        Object o1 = p1;
        //o1.
        Object o2 = new int[3];
        //o2[2] = 44;
        Object o3 = new Cat();
        Object o4 = 15;

        Programmer p10 = (Programmer) d1;
        p10.makeCode();

        //

        Driver d10 = new Programmer(types);



//чекает пренадлежит ли обьект к ирархии студентов!!
        if(d10 instanceof Student){
            Student st10 =(Student) d10;
            st10.learn();
        }
        else {
            System.out.println("d10 is not a Student");
        }
        //проверка на совпадение класса с указанным .Проверка на вложенность отсутсвует
        if (d10.getClass() == Student.class){
            Student st10 = (Student) d10;
            st10.learn();
        }
        else {
            System.out.println("d10 class is not a Student.class");
        }
        Triangle o100 = new Triangle(2,5,6);
        Shape sh100 =(Shape) o100;

        Object o200 = sh100;

        System.out.println(((Triangle)o100).getC());

    }


}