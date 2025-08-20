
package hw4.pkg5.and6;

public class Book {
    private String title;
    private String authorName;
    private double price;
    
    
    public Book(String title, String authorName, double price){
        this.title = title;
        this.authorName = authorName;
        this.price = price;
    }
    
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    
    public String getAuthorName(){
        return authorName;
    }
    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }
    
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    
    public void displayDetails(){
        System.out.println("Title: " + title + ", Author: " + authorName + ", Price: " + price);
    }
}
