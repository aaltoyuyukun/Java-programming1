//import java.util.Timer;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        // You can test your program here
        Timer t = new Timer();
        
        while (true) {
            System.out.println(t);
            t.advance();
            
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                
            }
        }
    }
}