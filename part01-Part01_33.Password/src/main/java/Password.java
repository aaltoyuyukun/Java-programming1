
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Password?");
        String psd = scan.nextLine();
        String valpsd = "Caput Draconis";
        if (psd.equals(valpsd)){
            System.out.println("Welcome!");
        }else{
            System.out.println("Off with you!");
        }
    }
}