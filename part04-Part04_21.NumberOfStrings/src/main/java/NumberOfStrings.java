//import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        //ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while(true){
            String word = scanner.nextLine();
            
            if(word.equals("end")){
                break;
            }else{
                sum++;
            }
        }
        System.out.println(sum);
    }
}