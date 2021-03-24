
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a first number:");
        int firstnum = Integer.valueOf(scan.nextLine());
        System.out.println("Give a second number:");
        int secondnum = Integer.valueOf(scan.nextLine());
        if (firstnum == secondnum){
            System.out.println("The numbers are equal!");
        } else if(firstnum > secondnum){
            System.out.println("Greater number is: " + firstnum);
        } else if(firstnum < secondnum){
            System.out.println("Geater number is: "+ secondnum);
        }
    }
}
