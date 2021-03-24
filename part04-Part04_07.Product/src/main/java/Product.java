
public class Product {
    private String fruit;
    private double price;
    private int quantity;
    
    public Product(String initialName, double initialPrice, int initialQuantity){
        this.fruit = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }
    
    public void printProduct(){
        System.out.print( this.fruit + "," + " price " + this.price + ", " + this.quantity + "pcs");
    }
}