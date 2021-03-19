package sBuilderTasks;

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj hasło");
        String password = scanner.next();
        boolean match = password.equalsIgnoreCase("Akademia");    //  1 sposób - krótszy, ale zwraca tylko "true" lub "false"
        System.out.println(match);

        if (password.equalsIgnoreCase("Akademia")) {               //  2 sposób - za pomocą instrukcji warunkowej "if" - wyświetlane wyniki możemy modyfikować
            System.out.println("Poprawne hasło");
        } else {
            System.out.println("Nie poprawne hasło");
        }

    }
}
