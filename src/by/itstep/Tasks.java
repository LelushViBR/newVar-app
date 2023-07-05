package by.itstep;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;
import java.util.SortedMap;

public class Tasks {
    public static void task1() {
        System.out.println("Task 1 Begin.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input A:");
        int a = sc.nextInt();
        System.out.println("Input B:");
        int b = sc.nextInt();
        System.out.println("Input C:");
        int c = sc.nextInt();

        System.out.println("Result: " + (a + "*x*x + " + b + "*x + " + c + " = 0 "));
        double x;
        double D = Math.pow(b, 2) - 4 * a * c;
        System.out.println("D is");
        if (D > 0) {
            System.out.println("2 roots");
            double x1, x2;
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("x1 is " + x1);
            System.out.println("x2 is " + x2);


        } else if (D == 0) {
            System.out.println("single root");
            double x1;
            x1 = -b / (2 * a);
            System.out.println("x1 is " + x1);
        } else {
            System.out.println("no roots");
        }
        System.out.println("Task 1 END.");


    }


    public static void main(String[] args) {
        System.out.println("Main Begin.");
        System.out.println("Main method logic.");
        task5();

        System.out.println("Main END.");

    }

    public static void task2() {
        System.out.println("Task 2 Begin.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Сторона A:");
        int a = sc.nextInt();
        System.out.println("Сторона B:");
        int b = sc.nextInt();
        System.out.println("Сторона C:");
        int c = sc.nextInt();
        double s, P = a + b + c, p;
        p = P / 2;
        s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        if ((a + b) > c && (b + c) > a && (a + c) > b) {
            System.out.println("Треугольник существует");
            System.out.println("S = " + s);
            if (a == b && a == c && b == c) {
                System.out.println("Треугольник равносторонний");
            } else if (a == b || a == c || b == c) {
                System.out.println("Треугольник равнобедренный");
            } else {
                System.out.println("Другой треугольник");
            }

        } else {
            System.out.println("Треугольник не существует");
        }
        System.out.println("Task 2 END.");


    }

    public static void task3() {
        System.out.println("Task 3 Begin.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Сторона  A:");
        int a = sc.nextInt();
        System.out.println("Сторона B:");
        int b = sc.nextInt();
        double s;
        s = a * b;
        if (a == b) {
            System.out.println("S = " + s);
            System.out.println("Это квадрат ");
        } else {
            System.out.println("S = " + s);
            System.out.println("это не квадрат");
        }
        System.out.println("Task 3 END.");
    }

    public static void task4() {
        System.out.println("Task 4 Begin.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус круга (R) ");
        int R = sc.nextInt();
        double S = Math.PI * Math.pow(R, 2);
        Double P = 2 * Math.PI * R;
        System.out.println("Площадь круга S = " + S);
        System.out.println("Периметр круга P = " + P);
        System.out.println("Task 4 END.");

    }

    public static void task5() {

        Scanner sc = new Scanner(System.in);
        System.out.println("1 = Уравнение");
        System.out.println("2 = Треугольник");
        System.out.println("3 = Прямоугольник");
        System.out.println("4 = Круг");
        System.out.println("5 = Каллории");
        System.out.println("Ведите номер задание :");
        int num = sc.nextInt();

        if (num == 1) {
            System.out.println("Уравнение");
            task1();
        } else if (num == 2) {
            System.out.println("Треугольник");
            task2();
        } else if (num == 3) {
            System.out.println("Прямоугольник");
            task3();
        } else if (num == 4) {
            System.out.println("Круг");
            task4();
        }else if (num == 5){
            System.out.println("Подсчет каллорий");
            task6();
        }
        else {
            System.out.println("нет такого");
        }
    }
    public static void task6(){
        System.out.println("Task 6 Begin.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваши параметры:");
        System.out.println("Введите массу ");
        int m = sc.nextInt();
        System.out.println("Введите рост");
        int h = sc.nextInt();
        System.out.println("Введите возраст");
        int age = sc.nextInt();
        double BMR;
        BMR = 447.6 + ( 9.2 * m ) + ( 3.1 * h ) + ( 4.3 * age );
        System.out.println("колличество каллорий в день для вас = " + BMR);
        System.out.println("Task 6 ENS.");

    }

}






