
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        //System.out.println("");
        for(int i=1; i <= number; i++){
            System.out.print("*");
        }
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for(int i=1; i <= number; i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for(int i=1; i <= size; i++){
            printSpaces(size-i);
            printStars(i);
            System.out.println("");
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        if(height < 3){
            System.out.println("heights shorter than 3 don't have to work correctly!");
        }else{
            for(int i=1; i <= height; i++){
                printSpaces(height-i);
                printStars(2*i-1);
                System.out.println("");
            }
            for(int j=1; j <= 2; j++){
                printSpaces(height-2);
                printStars(3);
                System.out.println("");
            }
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}