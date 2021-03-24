
import java.util.Scanner;

public class LineByLine {

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
                for(int index=0; index < pieces.length; index++){
                    System.out.println(pieces[index]);
                }
            }
        }
    }
}