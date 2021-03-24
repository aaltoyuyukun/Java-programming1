
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter t = new Counter(5);
        t.decrease();
        t.decrease();
        System.out.println(t.value());
        
        t.increase(5);
        System.out.println(t.value());
    }
}
