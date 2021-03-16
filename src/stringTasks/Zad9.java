package stringTasks;

import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String word = scanner.next();
        boolean result = word.contains("kot");

        System.out.println(result);
    }
}
