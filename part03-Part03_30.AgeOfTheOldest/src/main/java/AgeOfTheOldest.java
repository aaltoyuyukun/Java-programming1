
import java.util.Scanner;

public class AgeOfTheOldest {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] array = new int[10];
        int max = 0;
        while (true) {
            String input = reader.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            //max = Integer.valueOf(parts[1]);
            if(max < Integer.valueOf(parts[1])){
                max = Integer.valueOf(parts[1]);
            }
        }
        System.out.println("Age of the oldest:" + max);
    }
}