
import java.util.Scanner;

public class Squared {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.valueOf(scanner.nextLine());
        
        int product = first * first;
        System.out.println(product);
    }
}
