
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        System.out.println("Which file should have its contents printed?");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine(); //input line
        
        try (Scanner fileScanner = new Scanner(Paths.get(line))){
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                System.out.println(row);
            }
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}