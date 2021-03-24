
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        System.out.println("Search for?");
        int value = Integer.valueOf(scanner.nextLine());
        for(int j=0; j < list.size(); j++){
            if(value == list.get(j)){
                System.out.println(value + " is at index " + j);
            }
        }
        // implement here finding the indices of a number
    }
}