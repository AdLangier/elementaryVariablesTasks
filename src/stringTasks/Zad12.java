package stringTasks;

import java.util.Scanner;

public class Zad12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz ze znakiem *");
        String word = scanner.next().replace("*","");
        System.out.println(word);
    }
}
