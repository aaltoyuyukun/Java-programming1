
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archives = new ArrayList<>();
        int flag = 0;
        int flagexr = 0;
        
        while(true) {
            System.out.println("Identifier?(empty will stop)");
            String name = scanner.nextLine();
            if(name.isEmpty()) {
                break;
            }
            
            System.out.println("Name?(empty will stop)");
            String result = scanner.nextLine();
            if(result.isEmpty()) {
                break;
            }
            
            Archive archive = new Archive(name,result);
            
            for(int i=0; i<archives.size(); i++) {
                if(archive.equals(archives.get(i))){
                    flag++;
                }
            }
            
            if(flag > 0 || flagexr > 0){
                flag = 0;
                continue;
            }else{
                archives.add(archive);
            }
        }
        
        System.out.println("==Items==");
        Iterator it1 = archives.iterator();
        while(it1.hasNext()) {
            System.out.println(it1.next());
        }
    }
}