package stringTasks;

import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String word = scanner.next();
        System.out.println("Dwie ostatnie litery wyrazu to: \""
                +word.charAt(word.length()-2)+"\" oraz \""+word.charAt(word.length()-1)+"\"");
    }
}
//dodatkowo dodać cudzysłów przy podanych literach