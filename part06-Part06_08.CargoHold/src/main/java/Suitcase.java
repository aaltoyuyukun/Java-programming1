
import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int weightlimit;
    private int weightsum;
    
    public Suitcase(int weightlimit) {
        this.items = new ArrayList<>();
        this.weightlimit = weightlimit;
    }
    
    public void addItem(Item item) {
        if(this.weightsum < this.weightlimit) {
            if((this.weightsum + item.getWeight()) < this.weightlimit) {
                this.items.add(item);
                this.weightsum = 0;
                for(int i=0; i<this.items.size(); i++) {
                    this.weightsum += this.items.get(i).getWeight();
                }
            }
        }
    }
    
    public String toString() {
        if(this.items.size() == 0) {
            return "no items(" + this.weightsum + "kg)";
        }else if(this.items.size() == 1) {
            return this.items.size() + " item(" + this.weightsum + "kg)";
        }else {
            return this.items.size() + " items(" + this.weightsum + "kg)";
        }
    }
    
    public void printItems() {
        for(Item item: this.items){
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        int totalweight = 0;
        for(Item item:items) {
            totalweight += item.getWeight();
        }
        return totalweight;
    }
    
    public Item heaviestItem() {
        int heaviest = -1;
        int flag = 0;
        if (this.items.isEmpty()) {
            return null;
        }else {
            for(int i=0; i<this.items.size(); i++) {
                if(this.items.get(i).getWeight() > heaviest) {
                    heaviest = this.items.get(i).getWeight();
                    flag = i;
                }
            }
            return this.items.get(flag);
        }
    }
}
