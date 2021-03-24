
public class Gauge {
    private int value;
    
    public void increase(){
        value = value + 1;
        if(value >= 5){
            value = 5;
        }
    }
    
    public void decrease(){
        value = value - 1;
        if(value <= 0){
            value = 0;
        }
    }
    
    public int value(){
        return value;
    }
    
    public boolean full(){
        if(value == 5){
            return true;
        }else{
            return false;
        }
    }
}
