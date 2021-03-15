package numbersTasks;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość wygranych spotkań");
        int wins = scanner.nextInt();
        System.out.println("Podaj ilość przegranych spotkań");
        int loses = scanner.nextInt();
        int sum = wins + loses;
        int percentBalance = (wins * 100) / sum;                                    //liczenie procentów
        System.out.println("Zespół wygrywa " + percentBalance + "% meczów");

    }
}
