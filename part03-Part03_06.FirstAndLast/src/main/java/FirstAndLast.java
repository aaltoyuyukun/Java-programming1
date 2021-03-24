
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int IndexFirst = 0;
        int IndexEnd = 0;
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                IndexEnd = list.size() - 1;
                //IndexFirst = list.size() - IndexEnd - 1;
                IndexFirst = list.size() - IndexEnd - 1;
                System.out.println(list.get(IndexFirst));
                System.out.println(list.get(IndexEnd));
                break;
            }
            
            list.add(input);
        }

    }
}
