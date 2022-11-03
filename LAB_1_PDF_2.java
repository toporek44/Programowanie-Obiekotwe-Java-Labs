import java.util.Scanner;

public class Main {
  private static final Scanner scanner = new Scanner(System.in);

  private static void zad1() {
    System.out.print("Podaj a: ");
    var a = scanner.nextInt();

    System.out.print("Podaj b: ");
    var b = scanner.nextInt();

    System.out.print("Podaj c: ");
    var c = scanner.nextInt();

    var delta = Math.pow(b, 2) - 4 * a * c;
    System.out.println("Delta: " + delta);

    if (delta < 0) {
      System.out.println("Brak rozwiązania");
      return;
    }

    if (delta == 0) {
      var x = -b / 2 * a;
      System.out.println("Rozwiazanie: " + x);
      return;
    }

    var x = (-b - Math.sqrt(delta)) / 2 * a;
    var y = (-b + Math.sqrt(delta)) / 2 * a;
    System.out.println("Rozwiazanie: " + x + " oraz " + y);
  }

  private static double zad2a() {
    System.out.print("Podaj x: ");
    var x = scanner.nextDouble();
    if (x > 0) return x * 2;
    if (x == 0) return 0;
    return x * -3;
  }

  private static double zad2b() {
    System.out.print("Podaj x: ");
    var x = scanner.nextDouble();
    if (x >= 1) return Math.pow(x, 2);
    return x;
  }

  private static double zad2c() {
    System.out.print("Podaj x: ");
    var x = scanner.nextDouble();
    if (x > 2) return x + 2;
    if (x == 2) return 8;
    return x - 4;
  }

  private static void zad3() {
    var a = scanner.nextInt();
    var b = scanner.nextInt();
    var c = scanner.nextInt();

    if (a > b) {
      var tmp = a;
      a = b;
      b = tmp;
    }

    if (b > c) {
      var tmp = b;
      b = c;
      c = tmp;
    }

    if (a > b) {
      var tmp = a;
      a = b;
      b = tmp;
    }

    System.out.println(a + " " + b + " " + c);
  }

  private static void zad4() {
    System.out.print("Czy pada deszcz? (true/false): ");
    var rain = scanner.nextBoolean();

    System.out.print("Czy jest autobus na przystanku? (true/false): ");
    var bus = scanner.nextBoolean();

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
    var discount = scanner.nextBoolean();

    System.out.print("Czy otrzymałeś premię? (true/false): ");
    var bonus = scanner.nextBoolean();

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
    var a = scanner.nextInt();

    System.out.print("Podaj drugą liczbę: ");
    var b = scanner.nextInt();

    System.out.print("Podaj działanie: ");
    var operation = scanner.next();

    switch (operation) {
      case "+" -> System.out.println(a + b);
      case "-" -> System.out.println(a - b);
      case "*" -> System.out.println(a * b);
      case "/" -> System.out.println(a / b);
      case "%" -> System.out.println(a % b);
    }
  }

  public static void main(String[] args) {
    // zad1();
    // zad2a();
    // zad2b();
    // zad2c();
    // zad3();
    // zad4();
    // zad5();
    // zad6();
  }
}
