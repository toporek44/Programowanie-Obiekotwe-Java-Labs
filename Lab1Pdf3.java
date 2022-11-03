package com.company;

import java.util.Random;
import java.util.Scanner;

public class Lab1Pdf3 {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();


    public static void zad1() {
        System.out.print("Podaj n: ");
        int n = scanner.nextInt();
        int i = 0;
        double sum = 0;
        int[] studentsPoints = new int[n];
        while (i < n) {
            studentsPoints[i] = random.nextInt(11);
            sum += studentsPoints[i];
            i++;
        }
        System.out.println("srednia: " + sum / n);
    }

    public static void zad2() {
        System.out.print("Podaj liczby: ");
        int i = 0;
        int negativeNumbers = 0;
        int negativeSum = 0;
        int positiveNumbers = 0;
        int positiveSum = 0;
        int[] number = new int[10];
        while (i < 10) {
            number[i] = scanner.nextInt();
            if (number[i] < 0) {
                negativeNumbers++;
                negativeSum += number[i];
            } else {
                positiveNumbers++;
                positiveSum += number[i];
            }
            i++;
        }
        System.out.println("ilosc ujemnych:" + negativeNumbers);
        System.out.println("suma ujemnych:" + negativeSum);
        System.out.println("ilosc dodatnich:" + positiveNumbers);
        System.out.println("suma dodatnich:" + positiveSum);
    }

    public static void zad3(int n) {
        int pom = n;
        if (n < 0) {
            pom = n * -1;
        }
        int[] array = new int[pom];
        int i = 0;
        int sum = 0;
        while (i < pom) {
            array[i] = random.nextInt(11);
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
            i++;
        }
        System.out.println("suma parzystych:" + sum);
    }

    public static void zad4() {
        int n = random.nextInt(46) - 10;
        zad3(n);
    }

    public static boolean zad5() {
        System.out.println("podaj string:");
        String text = scanner.nextLine();
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if (forwardChar != backwardChar) {
                System.out.println("nie palindrom");
                return false;
            }
        }
        System.out.println("palindrom");
        return true;
    }
}
