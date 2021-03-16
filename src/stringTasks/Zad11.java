package stringTasks;

import java.util.Locale;
import java.util.Scanner;

public class Zad11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz z przynajmniej jedną dużą literą");
        String word = scanner.next().toLowerCase(Locale.ROOT);             // autouzupełnia :)
        System.out.println(word);
    }
}
