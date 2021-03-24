
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File? ");
        String file = scanner.nextLine();
        int lowerBound = 1000;
        int upperBound = -1000;
        int value = 0;
        
        try(Scanner fileScanner = new Scanner(Paths.get(file))){
            while(fileScanner.hasNextLine()){
                value ++;
                int input = Integer.valueOf(fileScanner.nextLine());
                if (lowerBound > input){
                    lowerBound = input;
                }
                
                if(upperBound < input){
                    upperBound = input;
                }
            }
            System.out.print("Lower bound?");
            System.out.println(lowerBound);
            System.out.print("Upper bound?");
            System.out.println(upperBound);
            System.out.println("Numbers:" + value);
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}