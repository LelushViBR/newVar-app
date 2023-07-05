package by.itstep;

import java.util.Scanner;

public class SwitchTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер задание : ");

        int num = sc.nextInt();
        if (num == 1) {
            System.out.println("1 задание ");
            Task1();


        } else if (num == 2) {
            System.out.println("2 задание ");
            Task2();

        } else if (num == 3) {
            System.out.println("3 задание");
            Task3();

        } else if (num == 4) {
            System.out.println("4 задание");
            Task4();

        }




    }
    public static void Task4 () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите букву");
        char ch = sc.next().charAt(0);
        int code = (int)ch;
        System.out.println("код символа " + code);
        if (Character.isLetter(ch)){//((code >= 65 && code <= 90) || (code >=97 && code <= 120 ))
            switch (Character.toLowerCase(ch)){
                case 'a':
                case 'i':
                case 'e':
                case 'y':
                case 'u':
                case 'o':
                    System.out.println("Гласная");
                    break;
                default:
                    System.out.println("согласная");
            }
        }
        else{
            System.out.println("попробуй еще раз");
        }



    }
    public static void Task3 () {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 4:
            case 5:
            case 3:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("я тебя раскрыл пидр");
        }
    }
    public static void Task2 () {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("Пон");
                break;
            case 2:
                System.out.println("вт");
                break;
            case 3:
                System.out.println("ср");
                break;
            case 4:
                System.out.println("чт");
                break;
            case 5:
                System.out.println("пт");
                break;
            case 6:
                System.out.println("сб");
                break;
            case 7:
                System.out.println("вск");
                break;
            default:
                System.out.println("Я тебя раскрыл пришелец");
                break;
        }
    }
    public static void Task1 () {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Not One and Not Two!");
        }

    }
}