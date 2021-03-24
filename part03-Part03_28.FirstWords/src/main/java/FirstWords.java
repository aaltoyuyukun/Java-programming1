
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "";
        String input = "";
        while(true){
            input = scanner.nextLine();
            text = input;
            String[] pieces = text.split(" ");
            
            if(input.equals("")){
                break;
            }else{
                System.out.println(pieces[0]);
            }
        }
    }
}