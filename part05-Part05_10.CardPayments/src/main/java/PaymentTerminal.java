
public class PaymentTerminal {
    
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals
    private int reseatAffordably;
    private int reseatHeartily;
    
    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
        this.reseatAffordably = 0;
        this.reseatHeartily = 0;
    }
    
    public double eatAffordably(double payment) {
        if((payment - 2.5) < 0){
            return payment;
        }else{
            this.affordableMeals++;
            this.money = this.money + 2.5;
            return (payment-2.5);
        }
//        this.money = this.money + 2.5;
    }
    
    public double eatHeartily(double payment) {
        if((payment - 4.3) < 0){
            return payment;
        }else{
            this.heartyMeals++;
            this.money = this.money + 4.3;
            return (payment-4.3);
        }
    }
    
    public boolean eatAffordably(PaymentCard card) {
        reseatAffordably++;
        if((card.balance() - 2.5*reseatAffordably)>0){
            this.affordableMeals++;
            card.booleaneatAffordablydecrease();
            return true;
        }else{
            return false;
        }
    }
    
    public boolean eatHeartily(PaymentCard card) {
        reseatHeartily++;
        if((card.balance() - 4.3*reseatHeartily)>0){
            this.heartyMeals++;
            card.booleaneatHeartilydecrease();
            return true;
        }else{
            return false;
        }
    }
    
    public void addMoneyToCard(PaymentCard card, double sum){
        card.addMoney(sum);
        this.money = this.money + sum;
    }
    
    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
