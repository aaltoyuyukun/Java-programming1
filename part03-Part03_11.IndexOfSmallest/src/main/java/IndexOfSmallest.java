
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int smallest = 0;
        int index_min = 0;
        int index_min_same = 0;
        while(true){
            int list = Integer.valueOf(scanner.nextLine());
            if(list == 9999){
                break;
            }
            numbers.add(list);
        }
        smallest = numbers.get(0);
        for(int index=0; index < numbers.size(); index++){
            if(numbers.get(index) < smallest){
                smallest = numbers.get(index);
                index_min = index;
            }
            if(numbers.get(index) == smallest){
                index_min_same = index;
            }
        }
        System.out.println("Smallest number: " + smallest);
        System.out.println("Found at index: " + index_min);
        System.out.println("Found at index: " + index_min_same);
    }
}