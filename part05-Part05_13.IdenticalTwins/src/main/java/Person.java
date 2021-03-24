
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }
    
    public boolean equals (Object compared) {
        // if the variables are located in the same position, they are equal
        if(this == compared) {
            return true;
        }
        
        // if the compared object is not of type Person, the objects are not equal
        if(!(compared instanceof Person)) {
            return false;
        }
        
        // if the values of the object variables are equal, the objects are equal
        Person comparedPerson = (Person) compared;
        if (this.name.equals(comparedPerson.name) &&
            this.birthday.equals(comparedPerson.birthday) &&
            this.height == comparedPerson.height &&
            this.weight == comparedPerson.weight){
            return true;
        }
        
        //otherwise the object are not equal
        return false;
        
    }
    
    // implement an equals method here for checking the equality of objects
}