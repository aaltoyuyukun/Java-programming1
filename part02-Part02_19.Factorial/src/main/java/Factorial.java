
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 1;
        int value = Integer.valueOf(scanner.nextLine());
        for(int i=1; i <= value; i++){
            sum = sum * i;
        }
        System.out.println("Factorial:" + sum);
    }
}
