/**
 *
 * @author yuyuk
 */
public class Cube {
    private int value;
    
    public Cube(int edgeLength){
        this.value = edgeLength;
        
    }
    
    public int volume(){
        return this.value * this.value * this.value;
    }
    
    public String toString(){
        return "The length of the edge is " + this.value + " and the volume " + this.value * this.value * this.value;
    }
}