

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }
    
    public static void printUntilNumber(int value){
        for(int i=1; i <= value; i++){
            System.out.println(i);
        }
    }
}
