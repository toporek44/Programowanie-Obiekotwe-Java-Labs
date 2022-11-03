package com.company;
import java.util.Scanner;

public class Lab1Pdf1 {

    public static void wypisz() {
        System.out.println("Hello world!");
    }

    public static void wczytaj() {
        int a, b, c;
        System.out.println("podaj a:");
        a = getInt();
        System.out.println("podaj b:");
        b = getInt();
        System.out.println("podaj c:");
        c = getInt();
    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }

    public static void getNameAndAge() {
        System.out.println("Przemek 21");
    }

    public static void calculator(int a, int b) {
        System.out.println(a - b);
        System.out.println(a + b);
        System.out.println(a * b);
    }

    public static boolean isOdd(int liczba) {
        return liczba % 2 != 0;
    }

    public static boolean isDividedByThreeOrFive(int liczba) {
        return liczba % 3 == 0 && liczba % 5 == 0;
    }

    public static double PODNIESIONA_DO_POTEGI_3(int a) {
        return Math.pow(a, 3);
    }

    public static double pierwiastek(int a) {
        return Math.sqrt(a);
    }

    public static void trojkat(int c) {
        System.out.println("wpisujta");
        calculate(getInt(), getInt(), c);
    }

    private static void calculate(int a, int b, int c) {
        System.out.println(
                Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) ||
                        Math.pow(c, 2) + Math.pow(b, 2) == Math.pow(a, 2) ||
                        Math.pow(c, 2) + Math.pow(a, 2) == Math.pow(b, 2)
        );
    }
}
