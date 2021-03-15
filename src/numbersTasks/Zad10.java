package numbersTasks;

import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int a = scanner.nextInt();
        System.out.println("Ostatnia cyfra danej liczby to " + a % 10);    // DO ZAPAMIĘTANIA !!!!!!!!!!!!!!!
    }
}
