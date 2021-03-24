
import java.util.Scanner;
public class IndexWasNotFound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int index = 0;
        
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;
        
        System.out.print("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());
        int value = searching;
        int flag = 0;
        // Implement the search functionality here
        while(index < array.length){
           if(array[index] == value){
               System.out.println(value + " is at index " + index + ".");
               flag = 1;
           }
           index ++;
        }
        if(flag == 0){
            System.out.println(value + " was not found.");
        }
    }
}