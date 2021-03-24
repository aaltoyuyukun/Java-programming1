
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here
        System.out.print("Give a word:");
        String name = scanner.nextLine();
        String whole_name = name + name + name;
        System.out.println(whole_name);
    }
}
