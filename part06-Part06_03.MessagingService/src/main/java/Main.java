
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // Try out your class here
        String s = "";
        Scanner scanner = new Scanner(System.in);
        String ss = scanner.nextLine();
//      
        Message mess = new Message(ss,s);
        
        MessagingService message = new MessagingService();
        message.add(mess);
    }
}
