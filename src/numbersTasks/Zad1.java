package numbersTasks;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dwie liczby");
        double a = scanner.nextInt();                          //"double" ponieważ to typ zmiennoprzecinkowy
        double b = scanner.nextInt();
        double c = (a + b) / 2;
        System.out.println("średnia arytmetyczna tych liczb to " + c);
    }
}
