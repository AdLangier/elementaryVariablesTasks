package stringTasks;

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo");
        String word = scanner.next();

        System.out.println("Przedostatnia litera wyrazu to: "+word.charAt(word.length()-2)); // Nie wiem czemu -2 ale tak ma być :)
    }
}
