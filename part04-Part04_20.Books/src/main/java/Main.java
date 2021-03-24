import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // implement here the program that allows the user to enter
        // book information and to examine them
        ArrayList<Book> informations = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.print("Title:");
            String title = scanner.nextLine();
            
            if(title.isEmpty()){
                break;
            }
            
            System.out.print("Pages:");
            int durations = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year:");
            int pub_year = Integer.valueOf(scanner.nextLine());
            
            informations.add(new Book(title,durations,pub_year));
        }
        
        System.out.print("What information will be printed? ");
        String word = scanner.nextLine();
        
        if(word.equals("everything")){
            for(Book info : informations){
                System.out.println(info);
            }
        }else if(word.equals("name")){
            for(Book info : informations){
                System.out.println(info.getname());
            }
        }else if(word.equals("pages")){
            for(Book info : informations){
                System.out.println(info.pages());
            }
        }else if(word.equals("pub_year")){
            for(Book info : informations){
                System.out.println(info.pub_year());
            }
        }
    }
}