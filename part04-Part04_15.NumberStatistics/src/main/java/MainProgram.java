
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int value = 0;
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise
        
        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers,
        // and lastly the one that tracks the sum of odd numbers!
        Statistics statistics = new Statistics();
        while(true){
            value = Integer.valueOf(scanner.nextLine());
            if(value == -1){
                break;
            }else{
                statistics.addNumber(value);
                
                if(value % 2 == 0){
                    statistics.addevenNumber(value);
                }else{
                    statistics.addoddNumber(value);
                }
            }
        }
        //statistics.addNumber(3);
        //statistics.addNumber(5);
        //tatistics.addNumber(1);
        //statistics.addNumber(2);
        //System.out.println("Count:" + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statistics.evensum());
        System.out.println("Sum of odd numbers: " + statistics.oddsum());
        System.out.println("Average: " + statistics.average());
    }
}