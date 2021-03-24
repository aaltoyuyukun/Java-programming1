
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account Matthews_account = new Account("Matthews account",1000);
        Account My_account = new Account("My account",0);
        
        Matthews_account.withdrawal(100.0);
        My_account.deposit(100.0);
        
        System.out.println(Matthews_account);
        System.out.println(My_account);
    }
}
