
public class HealthStation {
    private int value;
    
//    public HealthStation(){
//        this.value++;
//    }
    
    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.value++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        person.growWeight();
    }
    
    public int weighings() {
        return this.value;
    }
}
