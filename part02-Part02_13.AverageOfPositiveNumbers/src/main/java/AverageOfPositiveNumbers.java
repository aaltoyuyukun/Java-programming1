
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float sum = 0;
        int numbers = 0;
        float average = 0;
        while(true){
            float value = Integer.valueOf(scanner.nextLine());
            if(value == 0){
                if(numbers == 0){
                    System.out.println("Cannot calculate the average");
                }else{
                    break;
                }
            }else if(value > 0){
                sum = sum + value;
                numbers = numbers + 1;
                average = sum / numbers;
            }else{
                continue;
            }
        }
        System.out.println(average);
    }
}