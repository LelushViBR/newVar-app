package by.itstep;

import java.util.Scanner;

public class ArraysUtill {
    public static void main(String[] args) {
//        int arr[] = {12, 2};
//        int[] arr2;
//        int[][] arr3;
//        int[][] arr4[];
//        int[][] arr5[][][][][][][][][][][][][][][][];
//        arr2 = new int[]{12, 2};
//        int[] arr6 = new int[5];
//        int[] arr8 = new int[5];
//        int[] arr100 = new int[]{21312, 42, 32, 42, 321, 321, 312, 321, 321, 321, 321, 3, 21, 321, 31};
//        int arr100Size = arr100.length;
//        System.out.println(arr100Size + "=" + arr100[0]);
//        arr100[3] = arr100[3] * 5;
//        System.out.println(arr100[3]);
//        int lastindex = arr100.length - 1;
//        System.out.println(lastindex);
//        System.out.println(arr100[lastindex]);
//        int i = arr100.length - 1;
//        System.out.println(arr100[i]);
//        char[] chars = {'h', 'e', 'l', 'l', '0'};
//        System.out.println(chars[2 - 1]);
//        int[] arr1000 = new int[1000];
//        arr1000[999] = 999;
//        arr1000[2] = 1111;
//        System.out.println(arr1000[arr1000.length - 1]);
//        int[] a = new int[5];
//        a[0] = 22;
//        a[1] = 123;
//        a[2] = 10;
//        a[3] = -99;
//        a[4] = 0;
//        int[] aCopy = new int[a.length + 3];
//        Scanner sc = new Scanner(System.in);
//
//        aCopy[0] = a[0];
//        aCopy[1] = a[1];
//        aCopy[2] = a[2];
//        aCopy[3] = a[3];
//        aCopy[4] = a[4];
//        aCopy[5] = aCopy[0] + aCopy[1] + aCopy[2] + aCopy[3] + aCopy[4];
//        aCopy[6] = aCopy[0] * 100;
//        aCopy[7] = aCopy.length;
//        System.out.println(aCopy[6]);
//        int num = sc.nextInt();
//        int[] arr200 = {33, 123, 80, 15};
//        int m = Task1(arr200);
//        System.out.println("max = " + m);
        int [] x = ArraysUtill.getRandomArray(20);
        ArraysUtill.printArray(x,true);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array [" + i + "] " + array[i]);
        }
    }

    public static void print(int[] array) {
        System.out.print("array = ");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i] + ".");
            } else {
                System.out.print(array[i] + " , ");
            }
        }
    }

    public static int Task1(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++){
            if(max < array[i]){
                max = array[1];
            }
        }
        return max;
    }
    public static void printArray(int[] array , boolean inLine) {
            if (inLine){
                System.out.print("array = ");
                for (int in = 0; in < array.length; in++) {
                    if (in == array.length - 1) {
                        System.out.print(array[in] + ".");
                    } else {
                        System.out.print(array[in] + " , ");
                    }
                }

            }
            else
                print(array);
    }
    public static int[] getRandomArray(int maxSize){
        int size = MathUtil.genRandom(maxSize);
        int[] arr = new int[size];
        for( int i = 0 ; i < arr.length ;i++){
            arr[i]= MathUtil.genRandom();
        }
        return arr;
    }


}