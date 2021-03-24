
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }
    // implement the required methods here
    
    public void addMeal(String meal) {
        if(this.meals.contains(meal)) {
            
        }else {
            this.meals.add(meal);
        }
    }
    
    public void clearMenu() {
        for (int i=0; i<this.meals.size(); i++) {
            this.meals.clear();
        }
    }
    
    public void printMeals() {
        for (String mean: this.meals) {
            System.out.println(mean);
        }
    }
}
