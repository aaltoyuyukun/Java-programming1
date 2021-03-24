
public class Debt {
    private double balance;
    private double InterestRat;
    
    public Debt(double balance, double InterestRat){
        this.balance = balance;
        this.InterestRat = InterestRat;
    }
    
    public void printBalance(){
        System.out.println( this.balance);
    }
    
    public void waitOneYear(){
        this.balance = this.balance * this.InterestRat;
    }
}