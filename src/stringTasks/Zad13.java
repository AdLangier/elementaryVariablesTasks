package stringTasks;

import java.util.Scanner;

public class Zad13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String word = scanner.next();
        boolean check = word.endsWith("tka");
        System.out.println(check);
    }
}
