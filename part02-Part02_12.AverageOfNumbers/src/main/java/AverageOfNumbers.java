
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float sum = 0;
        int numbers = 0;
        float average = 0;
        while(true){
            System.out.println("Give a number:");
            float value = Integer.valueOf(scanner.nextLine());
            if (value != 0){
                sum = sum + value;
                numbers = numbers + 1;
                average = sum / numbers;
            }else{
                break;
            }
        }
        System.out.println("Average of the numbers: " + average);
    }
}