
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        int value1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int value2 = Integer.valueOf(scanner.nextLine());
        for(int i=value2; i <= value1; i++){
            System.out.println(i);
        }
        // Write your program here
    }
}