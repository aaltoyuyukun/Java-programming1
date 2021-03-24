
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        int f_found = 0;
        int f_unfound = 0;
        try (Scanner fileScanner = new Scanner(Paths.get(file))){
            while (fileScanner.hasNextLine()){
                String row = fileScanner.nextLine();
                if(searchedFor.equals(row)){
                    f_found++;
                    break;
                }else{
                    f_unfound++;
                }
            }
            if(f_found > 0){
                 System.out.println("Found!");
            }else if(f_unfound > 0){
                 System.out.println("Not found.");
            }
        }catch (Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}