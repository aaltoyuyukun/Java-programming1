
import java.util.ArrayList;

public class SimpleCollection {
    private String name;
    private ArrayList<String> elements;
    
    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }
    
    public void add(String element) {
        this.elements.add(element);
    }
    
    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        String printOutput = "The collection " + this.name;
        if (this.elements.isEmpty()) {
            return printOutput + " is empty.";
        }
        String thelist = "";
        int s = this.elements.size();
        for (int i=0; i<s; i++) {
            if(i == s-1) {
                thelist += this.elements.get(i);
            }else {
                thelist += this.elements.get(i) + "\n";
            }
        }
        
        if (s == 1) {
            return printOutput + " has " + s + " element:" + "\n" + thelist;
        }else {
            return printOutput + " has " + s + " elements:" + "\n" + thelist;
        }
    }
}