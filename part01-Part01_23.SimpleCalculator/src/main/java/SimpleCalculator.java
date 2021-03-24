
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        int sum = first + second;
        int minus = first - second;
        int multiplication = first * second;
        double division;
        division = first * 1.0 / second;
        System.out.println(first + " + " + second + " = " + sum);
        System.out.println(first + " - " + second + " = " + minus);
        System.out.println(first + " * " + second + " = " + multiplication);
        System.out.println(first + " / " + second + " = " + division);
        // Write your program here

    }
}
