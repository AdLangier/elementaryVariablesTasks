package sBuilderTasks;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String word = scanner.next();
        StringBuilder reversedWord = new StringBuilder(word);     //Zawsze trzeba utworzyć nowy obiekt StringBuilder, dopiero potem wykonać metodę reverse
        reversedWord.reverse();
        System.out.println("Podany wyraz odwrotnie to: "+reversedWord);

    }
}
