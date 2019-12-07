package sg.edu.ntu.classesobjects.classes;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        qty = 0;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this(name,authors,price);
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
       return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString(){
        StringBuilder author = new StringBuilder();
        for(int i = 0; i < authors.length; i++){
            author.append(authors[i].toString());
            if(i!= authors.length - 1){
                author.append(",");
            }
        }
        author.append(".");
        return name+","+author.toString()+","+"Price = "+price+","+"Quantity : "+qty;
    }

    public String getAuthorNames() {
        StringBuilder name  = new StringBuilder();
       for(int i = 0; i < authors.length;i++){
           name.append(authors[i].getName());
           if(i != authors.length - 1){
               name.append(",");
           }
       }
       name.append(".");
       return name.toString();
    }

}
