
public class Book {
    private String title;
    private int pages;
    private int pub_year;
    
    public Book (String title, int pages, int pub_year) {
        this.title = title;
        this.pages = pages;
        this.pub_year = pub_year;
    }
    
    public String getname(){
        return this.title;
    }
    
    public int pages(){
        return this.pages;
    }
    
    public int pub_year(){
        return pub_year;
    }
    
    @Override
    public String toString(){
        return this.title + ", " + this.pages + " pages, " + this.pub_year;
    }
}