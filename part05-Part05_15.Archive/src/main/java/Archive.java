
public class Archive {
    private String name;
    private String result;
    
    public Archive(String name, String result) {
        this.name = name;
        this.result = result;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getResult() {
        return this.result;
    }
    
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        
        if(!(compared instanceof Archive)) {
            return false;
        }
        
        Archive comparedArchive = (Archive) compared;
        
        if(comparedArchive.name.contains(this.name)) {
           return true;
        }
        return false;
    }
    
    public String toString() {
        return this.name + ": " + this.result;
    }
}
