package stringTasks;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String word = scanner.next();
        int length = word.length();                    //WAŻNE! - poniżej kolejność podania warunków logicznych najpierw && potem ||

        if (length % 10 == 2 && length != 12|| length % 10 == 3 && length != 13 || length % 10 == 4 && length != 14) {
            System.out.println("Długość podanego wyrazu to " + length + " litery");
        } else {
            System.out.println("Długość podanego wyrazu to " + length + " liter");
        }
    }
}
//dodatkowo - dodać warunek, który będzie poprawnie formatował słowo "litery"