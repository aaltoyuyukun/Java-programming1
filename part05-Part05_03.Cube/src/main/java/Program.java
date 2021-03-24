
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = Integer.valueOf(scanner.nextLine());
        
        Cube result = new Cube(value);
        System.out.println(result);
        // Experiment with your program here
    }
}
