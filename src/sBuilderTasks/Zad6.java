package sBuilderTasks;

import java.util.Scanner;

public class Zad6 {                                      //Uwaga!! Podchwytliwe
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Napisz zdanie");
        String sentence = scanner.nextLine();
        System.out.println(sentence.replace(sentence.charAt(0), '\0')    //SUPER WAŻNE !! -- puste miejsce w dla typu "char" deklarujemy jako \0!!!!
                .replace(sentence.charAt(sentence.length() - 1), '\0'));
    }
}
