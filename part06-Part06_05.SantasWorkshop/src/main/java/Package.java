
import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts;
//    private int weight;
    
    public Package() {
        this.gifts = new ArrayList<>();
    }
    
    public void addGift(Gift gift) {
        this.gifts.add(gift);
    }
    
    public int totalWeight() {
        int weight_s = 0;
        for (int i=0; i<this.gifts.size(); i++) {
            weight_s += this.gifts.get(i).getWeight();
        }
        return weight_s;
    }
}
