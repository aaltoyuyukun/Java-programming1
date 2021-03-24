
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] array = new int[10];
        int oldest = 0;
        String name = "";
        
        float year_average = 0;
        int sum = 0;
        
        while (true) {
            String input = reader.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] parts = input.split(",");
            if(oldest <= Integer.valueOf(parts[1])){
                oldest = Integer.valueOf(parts[1]);
                name = name + parts[0];
            }
        }
        System.out.println("Name of the oldest:" + name);
    }
}