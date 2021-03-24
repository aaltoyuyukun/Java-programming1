
public class PaymentCard {

    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        this.balance += increase;
    }
    
    public void booleaneatAffordablydecrease(){
        this.balance = this.balance - 2.5;
    }
    
    public void booleaneatHeartilydecrease(){
        this.balance = this.balance - 4.3;
    }

    public boolean takeMoney(double amount) {
        if((this.balance - amount) > 0){
            this.balance = this.balance - amount;
            return true;
        }else{
            return false;
        }
    }
}
