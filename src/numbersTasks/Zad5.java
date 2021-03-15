package numbersTasks;

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj promień koła w cm");
        int r = scanner.nextInt();
        double circleField = r * r * Math.PI;
        System.out.println("Pole koła to " + String.format("%.2f", circleField) + " cm2"); // z zaokrągleniem do 2 miejsc po przecinku
    }
}
