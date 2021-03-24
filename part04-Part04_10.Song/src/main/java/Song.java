
public class Song {
    private String name;
    private int value;
    
    public Song(String name, int value){
        this.name = name;
        this.value = value;
    }
    
    public int length(){
        return this.value;
    }
    
    public String name(){
        return this.name;
    }
}