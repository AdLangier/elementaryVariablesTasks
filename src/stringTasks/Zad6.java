package stringTasks;

import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String word = scanner.next();
        System.out.println("Pierwsza litera tego wyrazu to: " + word.charAt(0));
    }
}
