package by.itstep;

public class VarTester {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("My name is Sasha");

        System.out.print("Corrent t = -2\n");
        System.out.print("Tomorrow t = -6\n");

        //variable declaration - Обьявление переменной
        //<type> <var_name>;
        int temp;
        double avg;


        //variable initialisation - ввод данных в переменные
        //<var_name> = <value>;
        temp = -2;
        avg = 10.0;

        //variable declaration & initialisation in single line
        //<type> <var_name> = <value>;
        int age = 35;
        int h = 176;

        System.out.println("my age is " + age);
        System.out.println("Corrent t is " + temp);
        System.out.println("My h is " + avg);
        int ttemp = 31;
        System.out.println("Tomorrows temp is " + ttemp);


        //<type> <var_name> = <value> ,... ;
        int a = 15, b = 30;
        int cac = 8, dac = 7, fac = 9, gac = 10;
        System.out.println("my cac mark is " + cac );
        System.out.println("my dac mark is " + dac );
        System.out.println("my fac mark is " + fac );
        System.out.println("my gac mark is " + gac );


    }
}
