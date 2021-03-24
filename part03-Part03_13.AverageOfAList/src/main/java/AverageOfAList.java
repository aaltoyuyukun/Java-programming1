
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        double average = 0;
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        while(true){
            int value = Integer.valueOf(scanner.nextLine());
            if(value == -1){
                break;
            }else{
                list.add(value);
            }
        }
        for(int index=0; index < list.size(); index++){
            sum = sum + list.get(index);
            //System.out.println(sum);
        }
        average = (double) sum / list.size();
        System.out.println("");
        System.out.println("Average:" + average);
    }
}
