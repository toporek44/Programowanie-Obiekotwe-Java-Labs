package com.company;

import java.util.Scanner;


public class Lab1Pdf2 {
    private static final Scanner scanner = new Scanner(System.in);

    private static void zad1() {
        System.out.print("Podaj a: ");
        int a = scanner.nextInt();

        System.out.print("Podaj b: ");
        int b = scanner.nextInt();

        System.out.print("Podaj c: ");
        int c = scanner.nextInt();

        double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.println("Delta: " + delta);

        if (delta < 0) {
            System.out.println("Brak rozwiązania");
            return;
        }

        if (delta == 0) {
            int x = -b / 2 * a;
            System.out.println("Rozwiazanie: " + x);
            return;
        }

        double x = (-b - Math.sqrt(delta)) / 2 * a;
        double y = (-b + Math.sqrt(delta)) / 2 * a;
        System.out.println("Rozwiazanie: " + x + " oraz " + y);
    }

    private static double zad2a() {
        System.out.print("Podaj x: ");
        double x = scanner.nextDouble();
        if (x > 0) return x * 2;
        if (x == 0) return 0;
        return x * -3;
    }

    private static double zad2b() {
        System.out.print("Podaj x: ");
        double x = scanner.nextDouble();
        if (x >= 1) return Math.pow(x, 2);
        return x;
    }

    private static double zad2c() {
        System.out.print("Podaj x: ");
        double x = scanner.nextDouble();
        if (x > 2) return x + 2;
        if (x == 2) return 8;
        return x - 4;
    }

    private static void zad3() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        if (b > c) {
            int tmp = b;
            b = c;
            c = tmp;
        }

        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        System.out.println(a + " " + b + " " + c);
    }

    private static void zad4() {
        System.out.print("Czy pada deszcz? (true/false): ");
        boolean rain = scanner.nextBoolean();

        System.out.print("Czy jest autobus na przystanku? (true/false): ");
        boolean bus = scanner.nextBoolean();

        if (rain && bus) {
            System.out.println("Weź parasol");
            System.out.println("Dostaniesz się na uczelnie");
        } else if (rain) {
            System.out.println("Nie dostaniesz się na uczelnię");
        } else if (bus) {
            System.out.println("Dostaniesz się na uczelnie");
            System.out.println("Miłego dnia i pięknej pogody");
        }
    }

    private static void zad5() {
        System.out.print("Czy masz zniżkę na samochód? (true/false): ");
        boolean discount = scanner.nextBoolean();

        System.out.print("Czy otrzymałeś premię? (true/false): ");
        boolean bonus = scanner.nextBoolean();

        if (discount || bonus) {
            System.out.println("Możesz kupić samochód!");
        } else {
            System.out.println("Zakup samochodu trzeba odłożyć na później...");
        }

        if (!discount) {
            System.out.println("Zniżki na samochód nie ma");
        }
    }

    private static void zad6() {
        System.out.print("Podaj pierwszą liczbę: ");
        int a = scanner.nextInt();

        System.out.print("Podaj drugą liczbę: ");
        int b = scanner.nextInt();

        System.out.print("Podaj działanie: ");
        char operation = scanner.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
        }
    }
}
