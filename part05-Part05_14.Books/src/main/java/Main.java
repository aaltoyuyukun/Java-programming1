
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        int flag = 0;
        
        while (true) {
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            
            Book book = new Book(name, publicationYear);
            
            for(int i=0; i<books.size(); i++) {
                if(book.equals(books.get(i))) {
                    flag++;
                }
            }
            
            if (flag > 0){
                flag=0;
                continue;
            }else{
                books.add(book);
            }
        }
        // NB! Don't alter the line below!
        System.out.println("Thank you! Books added: " + books.size());
    }
}
