package sBuilderTasks;

import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Napisz zdanie");
        String sentence = scanner.nextLine();
        boolean result = sentence.contains("kot") || sentence.contains("Kot");
        System.out.println(result);
    }
}
