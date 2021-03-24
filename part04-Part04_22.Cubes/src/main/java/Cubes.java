
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        while(true){
            String input_str = scanner.nextLine();
            if(input_str.equals("end")){
                break;
            }else{
                Integer num = Integer.valueOf(input_str);
                System.out.println(num * num * num);
            }
        }
    }
}