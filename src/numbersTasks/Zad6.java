package numbersTasks;

import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int a = scanner.nextInt();

        if (a % 3 == 0) {
            System.out.println("liczba jest podzielna przez 3");
        } else {
            System.out.println("Liczba nie jest podzielna przez 3");
        }
    }
}
