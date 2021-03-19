package sBuilderTasks;

import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę Państwa");
        String country = scanner.next();

        System.out.println("Skrót: " + country.substring(1, 3));  // WAŻNE!! (substring) początkowy index jest wyświetlany włącznie, natomiast końcowy jest wyłączony z wyświetlania!!
    }
}
