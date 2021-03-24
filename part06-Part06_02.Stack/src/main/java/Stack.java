
import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack;
    
    public Stack() {
        this.stack = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        if(!(this.stack.isEmpty())) {
            return false;
        }else {
            return true;
        }
    }
    
    public void add(String value) {
        this.stack.add(value);
    }
    
    public ArrayList<String> values() {
        return this.stack;
    }
    
    public String take() {
        
        int value = this.stack.size();
        String s = this.stack.remove(value-1);
        return s;
    }
}
