
import java.util.Scanner;

public class AVClub {

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
                    if(pieces[index].contains("av")){
                        System.out.println(pieces[index]);
                    }
                }
            }
        }
    }
}