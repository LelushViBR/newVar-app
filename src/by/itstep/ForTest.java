package by.itstep;

import java.util.Scanner;

public class ForTest {

    public static void task1() {
        for (int i = 0; i <= 2000; i = i + 2) {
            System.out.println(i + " ");
        }
    }

    public static void task2() {
        for (int i = 1; i <= 1000; i = i + 2) {
            System.out.println(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер задание : ");

        int num = sc.nextInt();
        if (num == 1) {
            System.out.println("1 задание ");
            task1();
        } else if (num == 2) {
            System.out.println("2 задание ");
            task2();
        } else if (num == 3) {
            System.out.println("3 задание");
            task3();
        } else if (num == 4) {
            System.out.println("4 задание");
            task4();
        } else if (num == 5) {
            System.out.println(" 5 Задание ");
            task5();
        } else if (num == 6) {
            System.out.println("6 задание");
            task6();
        }
        else if (num == 7){
            System.out.println("7 задание");
            task7();
        }
        else if (num == 8){
            System.out.println("8 задание");
            task8();
        }


    }

    public static void task3() {
        for (int i = 0, number = 10; i < 50; i++) {
            System.out.println(number + " ");
            number = number + 10;
        }
    }

    public static void task4() {
        for (int i = 0, number = -1; i < 100; i++) {
            System.out.println(number + "");
            number = number - 1;
        }
    }

    public static void task5() {
        for (int i = 0, number = -1; i < 100; i++) {
            if (number % 2 == 0) {
                System.out.println(number * (-1) + "");
            } else
                System.out.println(number + " ");

            number--;

        }
    }

    public static void task6() {
        for (int i = 0, number = (int) (Math.random() * 11); i < 25; i++) {
            System.out.println(number + " ");
            number = (int) (Math.random() * 11);
        }
    }

    public static void task7() {
        for (int a = 2; a <= 9 ; a++){
            for (int b = 2 ; b <= 10 ; b++){
                int result = a * b ;
                System.out.println(a + " * " + b +  " = " + result);
            }
            System.out.println();

        }

    }
    public static void task8(){
        for ( int num = 0; num <9 ; num++){

            int studentnumber = (int) (Math.random() * 12) + 1;
            System.out.println(studentnumber);
        }
    }
}



