package ru.skypro;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        int[] array = new int[]{1, 2, 3};
        double[] arrayTwo = {1.57, 7.654, 9.986};
        char[] arrayChar = {'a', 'b', 'c'};
    }

    public static void task2() {
        int[] array = new int[]{1, 2, 3};
        double[] arrayTwo = {1.57, 7.654, 9.986};
        char[] arrayChar = {'a', 'b', 'c'};
        for (int i = 0; i <  array.length; i++) {
            if (i < array.length - 1)
                System.out.print(array[i] + ", ");
             else System.out.print(array[i]);
        }
        System.out.println();
        for (int i = 0; i < arrayTwo.length; i++) {
            if (i < arrayTwo.length - 1)
            System.out.print(arrayTwo[i] + ", ");
            else System.out.print(arrayTwo[i]);
        }
        System.out.println();
        for (int i = 0; i < arrayChar.length; i++) {
            if (i < arrayChar.length - 1)
            System.out.print(arrayChar[i] + ", ");
            else System.out.println(arrayChar[i]);
        }

    }

    public static void task3(){
        int[] array = new int[]{1, 2, 3};
        double[] arrayTwo = {1.57, 7.654, 9.986};
        char[] arrayChar = {'a', 'b', 'c'};
        for (int i = array.length - 1; i >= 0; i--) {
            if (i>0){
                System.out.print(array[i] + ", ");
            } else
                System.out.print(array[i]);
        }

        System.out.println();
        for (int i = arrayTwo.length - 1; i >= 0; i--) {
            if (i>0){
                System.out.print(arrayTwo[i] + ", ");
            } else
                System.out.print(arrayTwo[i]);
            System.out.print(array[i]);
        }

        System.out.println();
        for (int i = arrayChar.length - 1; i >= 0; i--) {
            if (i>0){
                System.out.print(arrayChar[i] + ", ");
            } else
                System.out.print(arrayChar[i]);
        }

    }

    public static void task4(){
        System.out.println();
        int array[] = new int[]{1, 2, 3};
        for (int i = 0; i < 3; i++) {
            if (array[i]%2 > 0){
                array[i] = array[i] + 1;
                System.out.print(array[i] + " ");
            } else System.out.print(array[i] + " ");
        }
        }
    }
