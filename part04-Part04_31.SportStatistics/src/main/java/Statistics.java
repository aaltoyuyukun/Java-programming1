
public class Statistics {
    
    private String team;
    private String games;
    private int value1;
    private int value2;
    
    public Statistics(String team, String games, int value1, int value2) {
        this.team = team;
        this.games = games;
        this.value1 = value1;
        this.value2 = value2;
    }
    
    public String getName() {
        return this.team;
    }
    
    public String getgames() {
        return this.games;
    }
    
    public int value1(){
        return value1;
    }
    
    public int value2(){
        return value2;
    }
    
//    @Override
//    public String toString() {
//        return this.team + ", age: " + this.games;
//    }
}