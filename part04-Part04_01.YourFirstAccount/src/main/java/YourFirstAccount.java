
public class YourFirstAccount {
        
    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account yukunAccount = new Account("yukun's account", 100.00);
        //Account deposits = new Account("yukun's deposits", 20.0);
        
        yukunAccount.deposit(20);
        
        System.out.println("balance: " + yukunAccount);
    }
}
