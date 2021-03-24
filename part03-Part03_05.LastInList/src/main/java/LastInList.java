
import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        int index = 0;
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                index = list.size() - 1;
                System.out.println(list.get(index));
                break;
            }
            list.add(input);
        }
        //System.out.println(value);
    }
}
