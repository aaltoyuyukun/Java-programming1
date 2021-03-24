import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class
        
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        
        while(true){
            System.out.print("Name:");
            String names = scanner.nextLine();
            if(names.isEmpty()){
                break;
            }
            System.out.print("Duration:");
            int durations = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(names,durations));
        }
        
        System.out.print("Program's maximum duration? ");
        int maximum_duration = Integer.valueOf(scanner.nextLine());
        
        for(TelevisionProgram program:programs ){
                //max = program.getDuration();
            if(program.getDuration() <= maximum_duration){
                //max = program.getDuration();
                System.out.println(program);
            }
        }
    }
}