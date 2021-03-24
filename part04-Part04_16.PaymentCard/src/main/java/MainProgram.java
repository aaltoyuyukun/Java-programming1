
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        PaymentCard Paulcard = new PaymentCard(20);
        //System.out.println("Create Paul's card. The opening balance of the card is " + Paulcard + "euros");
        
        PaymentCard Mattcard = new PaymentCard(30);
        //System.out.println("Create Matt's card. The opening balance of the card is " + Mattcard + "euros");
        
        Paulcard.eatHeartily();
        System.out.println("Paul " + Paulcard);
        
        Mattcard.eatAffordably();
        System.out.println("Matt " + Mattcard);

        Paulcard.addMoney(20);
        System.out.println("Paul " + Paulcard);
        
        Mattcard.eatHeartily();
        System.out.println("Matt " + Mattcard);
        
        Paulcard.eatAffordably();
        //System.out.println("Paul " + Paulcard);
        
        Paulcard.eatAffordably();
        System.out.println("Paul " + Paulcard);
        
        Mattcard.addMoney(50);
        System.out.println("Matt " + Mattcard);

//        System.out.println(card);
//        
//        card.addMoney(15);
//        System.out.println(card);
//        
//        card.addMoney(10);
//        System.out.println(card);
//        
//        card.addMoney(200);
//        System.out.println(card);
//        card.eatAffordably();
//        System.out.println(card);
//        
//        card.eatAffordably();
//        System.out.println(card);
    }
}