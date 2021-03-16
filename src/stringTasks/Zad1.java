package stringTasks;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię");
        String name = scanner.next();
        System.out.println("Podaj nazwisko");
        String surname = scanner.next();
        System.out.println("Twoje imię i nazwisko to: "+name+" "+surname);
    }
}
