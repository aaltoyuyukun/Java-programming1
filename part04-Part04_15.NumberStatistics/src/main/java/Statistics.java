
public class Statistics {
    private int count = 0;
    private int evensum = 0;
    private int oddsum = 0;
    private int sum = 0;
    //private double average = 0;
    
    public Statistics(){
        this.count = count;
        this.sum = sum;
        this.evensum = evensum;
        this.oddsum = oddsum;
        //this.average = average;
    }
    
    public void addNumber(int number){
        this.count++;
        this.sum = this.sum + number;
    }
    
    public void addevenNumber(int number){
        this.evensum = this.evensum + number;
    }
    
    public void addoddNumber(int number){
        this.oddsum = this.oddsum + number;
    }
    
    public int getCount(){
        return this.count;
    }
    
    public int sum(){
        return this.sum;
    }
    
    public int evensum(){
        return this.evensum;
    }
    
    public int oddsum(){
        return this.oddsum;
    }
    
    public double average(){
        return (double) this.sum / this.count;
    }
}