
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //ArrayList<Integer> sum = new ArrayList<>();
        int max_length = 0;
        int sum = 0;
        int length = 0;
        String name = "";
        
        float year_average = 0;
        
        while (true) {
            String input = reader.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] parts = input.split(",");
            if(max_length < parts[0].length()){
                max_length = parts[0].length();
                name = parts[0];
            }
            sum = sum + Integer.valueOf(parts[1]);
            length++;
            //sum.add(Integer.valueOf(parts[1]));
        }
        
//        for(int number:sum){
//            whole_sum = whole_sum + sum.get(number);
//        }
        
        year_average = (float) sum / length;
        System.out.println("Age of the oldest:" + name);
        System.out.println("Average of the birth year:" + year_average);
    }
}