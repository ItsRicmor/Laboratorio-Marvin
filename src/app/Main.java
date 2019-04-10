package app;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int number;
        System.out.print("Introduce un numero entero de 1 a 3999: ");
        number = scanner.nextInt();
        Romano romano = new Romano(number);
        System.out.println("\nEl numero romano es: " + romano.getRomanNumber());
    }
}
