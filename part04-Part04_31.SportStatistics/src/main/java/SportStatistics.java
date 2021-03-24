
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        int sum = 0;
//        int sum2 = 0;
        int wins = 0;
        int losses = 0;
//        int wins2 = 0;
//        int losses2 = 0;

        
        ArrayList<Statistics> team = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        ArrayList<Statistics> records = readRecordFromFile(file);
        
        System.out.println("Team:");
        String Team = scan.nextLine();
        
        System.out.print("Games: ");
        for (Statistics record : records){
            if(record.getName().contains(Team)){
                sum++;
                if(record.value1() > record.value2()){
                    wins++;
                }else{
                    losses++;
                }
            }else if(record.getgames().contains(Team)){
                sum++;
                if(record.value1() > record.value2()){
                    losses++;
                }else if(record.value1() < record.value2()){
                    wins++;
                }
            }
        }
        System.out.println(sum);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
    
    public static ArrayList<Statistics> readRecordFromFile(String file){
        ArrayList<Statistics> infos = new ArrayList<>();
        try(Scanner filescanner = new Scanner(Paths.get(file))){
             while(filescanner.hasNextLine()){
               String row = filescanner.nextLine();
               String[] parts = row.split(","); 
               infos.add(new Statistics(parts[0],parts[1],Integer.valueOf(parts[2]),Integer.valueOf(parts[3])));
             }
        }catch (Exception e){
            System.out.println("Error:" + e.getMessage());
        }
        return infos;
    }
}