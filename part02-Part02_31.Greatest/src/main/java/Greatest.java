
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int greatest = 0;
        greatest = number1;
        if(greatest < number2){
            greatest = number2;
            if(greatest < number3){
                greatest = number3;
            }
        }else if(greatest < number3){
            greatest = number3;
        }
        return greatest;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}