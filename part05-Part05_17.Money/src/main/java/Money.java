
public class Money {

    private final int euros; // with keyword "final", it should not be changed when defined. private int euros can be changed.
    private final int cents;
    
    public Money(int euros, int cents) {
        
        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }
        
        this.euros = euros;
        this.cents = cents;
    }
    
    public int euros() {
        return this.euros;
    }
    
    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros, this.cents);
        newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        
        int cents_new = 0;
        int euros_new = 0;
        
        cents_new = this.cents + addition.cents;
        euros_new = this.euros + addition.euros;
        
        if(cents_new > 99) {
            euros_new = euros_new + cents_new / 100;
            cents_new = cents_new % 100;
        }
        newMoney = new Money(euros_new, cents_new);
        
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        if(!(compared instanceof Money)) {
            return false;
        }
        
        if(this.euros == compared.euros) {
            if(this.cents < compared.cents) {
                return true;
            }
            return false;
        }else{
            if(this.euros < compared.euros) {
                return true;
            }
            return false;
        }
    }
    
    public Money minus(Money decreaser) {
        Money newMoney = new Money(this.euros, this.cents);
        newMoney = new Money(this.euros - decreaser.euros, this.cents - decreaser.cents);
//        
        int euros_new = 0;
        int cents_new = 0;
        
        euros_new = this.euros - decreaser.euros;
        cents_new = this.cents - decreaser.cents;
        
        if(euros_new > 0 || cents_new < 0) {
            euros_new--;
            cents_new = cents_new + 100;
        }
        
        if(euros_new < 0) {
            euros_new = 0;
            cents_new = 0;
        }
        newMoney = new Money(euros_new, cents_new);
        
        return newMoney;
    }
    
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }
        return this.euros + "." + zero + this.cents + "e";
    }
}
