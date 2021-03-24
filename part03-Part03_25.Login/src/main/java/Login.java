
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username:");
        String name = scanner.nextLine();
        System.out.print("Enter password:");
        String psw = scanner.nextLine();
        if(name.equals("alex")){
            if(psw.equals("sunshine")){
                System.out.println("You have successfully loggin in!");
            }
        }else if(name.equals("emma")){
            if(psw.equals("haskell")){
                System.out.println("You have successfully loggin in");
            }
        }
    }
}