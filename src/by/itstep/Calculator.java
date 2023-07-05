package by.itstep;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class Calculator {
    public static void ptintsumma(int a, int b) {
        System.out.println("summa = " + (a + b));

    }

    public static int summa(int a, int b) {
        int i = a + b;
        return i;

    }

    public static void main(String[] args) {
        menu();




    }

    public static double root(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("из отрицательного числа корень не выводят ");

        }
        return Math.sqrt(a);

    }

    public static int subtraction(int a, int b) {
        int i = a - b;
        return i;

    }

    public static double division(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль");

        }
        return a / b;

    }


    public static int multiplication(int a, int b) {
        int i = a * b;
        return i;

    }

    public static int distance(int v , int t) {
        int distanceresult = v * t;
        return distanceresult;

    }
    public static int hypotenuse( int a , int b){
        return (int) Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
    }
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1) сумма");
        System.out.println("2) вычетание");
        System.out.println("3) умножение");
        System.out.println("4) деление");
        System.out.println("5) корень");
        int num = sc.nextInt();
        switch (num) {
            case 1: {
                System.out.println("Введиете а :");
                int a = sc.nextInt();
                System.out.println("Введиете b :");
                int b = sc.nextInt();
                int r = summa(a, b);
                System.out.println("результат = " + r);
                break;
            }
            case 2: {
                System.out.println("Введиете а :");
                int a = sc.nextInt();
                System.out.println("Введиете b :");
                int b = sc.nextInt();
                int r = subtraction(a, b);
                System.out.println("результат = " + r);
                break;
            }
            case 3: {
                System.out.println("Введиете а :");
                int a = sc.nextInt();
                System.out.println("Введиете b :");
                int b = sc.nextInt();
                int r =multiplication(a, b);
                System.out.println("результат = " + r);
                break;
            }
            case 4: {
                System.out.println("Введиете а :");
                double a = sc.nextInt();
                System.out.println("Введиете b :");
                double b = sc.nextInt();
                double r = division(a, b);
                System.out.println("результат = " + r);
                break;
            }
            case 5: {
                System.out.println("Введиете а :");
                double a = sc.nextInt();
                double r = root(a);
                System.out.println("результат = " + r);
                break;
            }
            default:
                System.out.println("нет такого метода");

            }
        System.out.println("1 - продолжить");
        System.out.println("2 - закончить");
        int f = sc.nextInt();
        switch (f){
            case 1:{
                menu();
            }
            case 2:{
                break;
            }
        }
    }
    public static void random(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1) сумма");
        System.out.println("2) вычетание");
        System.out.println("3) умножение");
        System.out.println("4) деление");
        System.out.println("5) корень");
        int f =(int) (Math.random() * 5) ;
        if ( f == 0 ) {
            System.out.println("1)Сумма");
            System.out.println("Введиете а :");
            int a = sc.nextInt();
            System.out.println("Введиете b :");
            int b = sc.nextInt();
            int r = summa(a, b);
            System.out.println("результат = " + r);
        }
        else if ( f == 1 ) {
            System.out.println("2)вычетание");
            System.out.println("Введиете а :");
            int a = sc.nextInt();
            System.out.println("Введиете b :");
            int b = sc.nextInt();
            int r = subtraction(a, b);
            System.out.println("результат = " + r);
        }
        else if ( f == 2 ) {
            System.out.println("3)умножение");
            System.out.println("Введиете а :");
            int a = sc.nextInt();
            System.out.println("Введиете b :");
            int b = sc.nextInt();
            int r = multiplication(a, b);
            System.out.println("результат = " + r);
        }
        else if ( f == 3 ) {
            System.out.println("4)деление");
            System.out.println("Введиете а :");
            int a = sc.nextInt();
            System.out.println("Введиете b :");
            int b = sc.nextInt();
            double r = division(a,b);
            System.out.println("результат = " + r);
        }
        else if ( f == 4 ) {
            System.out.println("5)корень");
            System.out.println("Введиете а :");
            int a = sc.nextInt();
            double r = root(a);
            System.out.println("результат = " + r);
        }
        System.out.println("1 - повторить");
        System.out.println("2 - завершить");
        int num = sc.nextInt();
        switch (num){
            case 1 : {
                random();
            }
            case 2 : {
                break;
            }
        }


    }

}

