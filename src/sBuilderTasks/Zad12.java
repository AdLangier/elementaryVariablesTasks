package sBuilderTasks;

import java.util.Scanner;

public class Zad12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Napisz zdanie zawierające przynajmniej jedną literę \"a\"");
        String sentence = scanner.nextLine();
        System.out.println("Zdanie po tuningu to: "+sentence.replace("a","A"));
    }
}
