
public class SimpleDate {
    private int day;
    private int month;
    private int year;
    
    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
    
    public void advance() {
        if(this.day <= 30) {
            this.day++;
        }else{
            this.day = 1;
            if(this.month <= 12){
                this.month++;
            }else{
                this.month = 1;
                this.year++;
            }
        }
    }
    
    public void advance(int howManyDays) {
        if(this.day <= 30) {
            this.day = this.day + howManyDays;
        }else{
            this.day = 1;
            if(this.month <= 12){
                this.month++;
            }else{
                this.month = 1;
                this.year++;
            }
        }
    }
    
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        
        int y = days / 356;
        newDate.year = this.year + y;
        
        int m = (days % 356) / 12;
        newDate.month = this.month + m;
        
        int d = ((days % 356) % 30);
        newDate.day = this.day + d;
        
        if (newDate.month > 12) {
            newDate.month = newDate.month - 12;
            newDate.year++;
        }
        
        if (newDate.day > 30) {
            newDate.day = newDate.day - 30;
            newDate.month++;
        }
        
        return newDate;
    }
    
    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }
        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }
        return false;
    }
}