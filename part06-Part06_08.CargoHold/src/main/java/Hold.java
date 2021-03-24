
import java.util.ArrayList;

public class Hold {
    private int weightmaximum;
    private ArrayList<Suitcase> suitcases;
    private int pano = 0;
    
    public Hold (int weightmaximum) {
        this.weightmaximum = weightmaximum;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if(pano + suitcase.totalWeight() < this.weightmaximum) {
            suitcases.add(suitcase);
            pano += suitcase.totalWeight();
        }
    }
    
    public void printItems() {
        for (Suitcase suitcase:suitcases) {
            suitcase.printItems();
        }
    }
    
    public String toString() {
        return this.suitcases.size() + " suitcases (" + pano + "kg)";
    }
}
