package sBuilderTasks;

import java.util.Scanner;

public class Zad8 {                                              //Trudne -- metody klasy String
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz dane piłkarza w formacie: Imię i Nazwisko, Liczba Goli");
        String playerData = scanner.nextLine();
        int a = playerData.indexOf(" ");
        int b = playerData.indexOf(",");
        System.out.println("Nazwisko: " + playerData.substring(a, b));
    }
}
