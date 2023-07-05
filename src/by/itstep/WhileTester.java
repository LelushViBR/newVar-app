package by.itstep;

import java.util.Scanner;

public class WhileTester {
    public static void main(String[] args) throws InterruptedException {
        task4();

    }

    public static void task1() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сколько вы заливаете воды в мл (макс 5000):");
        int t = 23, ml = sc.nextInt();
        final int max = 100;
        if (ml >= 200 && ml <= 5000) {
            while (t <= max) {
                System.out.println("горим");
                Thread.sleep(500 * (ml / 1000));
                int x = (int) (Math.random() * 6) + 5;
                t += x;
                System.out.println("t = " + t);
                if (t >= 100) {
                    System.out.println("сгорели");
                }
            }
        } else {
            System.out.println("тебе не хватает воды (только не залевай больше 5000мл)");
        }
    }

    public static void task2() {
        int a = 0;
        while (a <= 2000) {
            System.out.println("a = " + a);
            a += 2;
        }
    }

    public static void task3() {
        int a = 0, b = -1;
        if(a <= 100) {
            while (b >= -100) {
                if (b % 2 == 0) {
                    System.out.println(b * (-1) + "");
                } else
                    System.out.println(b + " ");

                b--;

            }
            a++;

        }
    }
    public static void task4(){
        int a = 0 , number = (int) (Math.random() * 11);
        while (a < 9 ){
            number = ((int) (Math.random() * 11)) + 1 ;
            System.out.println(number);
            a+=1;

        }

    }
}