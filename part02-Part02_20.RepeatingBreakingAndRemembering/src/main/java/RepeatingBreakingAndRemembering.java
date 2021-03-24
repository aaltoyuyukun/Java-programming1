
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        //int value = Integer.valueOf(scanner.nextLine());
        System.out.println("Give numbers:");
        int sum = 0;
        int numbers = 0;
        int even = 0;
        int odd = 0;
        double average = 0;
        for(int i = 1;; i++){
            int value = Integer.valueOf(scanner.nextLine());
            if(value != -1){
                sum = sum + value;
                numbers = numbers + 1;
                average = (double) sum / numbers;
                if(value % 2 == 0){
                    even = even + 1;
                }else{
                    odd = odd + 1;
                }
            }else{
                System.out.println("Thx!Bye!");
                break;
            }
        }
        System.out.println("Sum:" + sum);
        System.out.println("Numbers:" + numbers);
        System.out.println(String.format("Average:%.12f", average));
        System.out.println("Even:" + even);
        System.out.println("Odd:" + odd);
    }
}