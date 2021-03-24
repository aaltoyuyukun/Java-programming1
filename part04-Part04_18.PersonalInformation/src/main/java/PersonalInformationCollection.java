
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class
        
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("First name:");
            String firstname = scanner.nextLine();
            if (firstname.isEmpty()){
                System.out.println("");
                break;
            }
            System.out.print("Last name:");
            String lastname = scanner.nextLine();
            System.out.print("Identification number:");
            String iden_number = scanner.nextLine();
            
            //items.add(new Item(items.getName()));
            infoCollection.add(new PersonalInformation(firstname,lastname,iden_number));
            //items.add(new Item(items.toString()));
        }
        for(PersonalInformation info : infoCollection) {
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }
    }
}