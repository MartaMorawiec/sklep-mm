package pl.sternik.mm.sklep;

import jdk.internal.jline.internal.Log;

public class Article extends Object{

    private int id;
    private String name;
    private String description;
    private double price;

    public static int getCounter() {
        return counter;
    }

    static int counter;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Article [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
    }

    public Article(int id, String name, String description, double price) {
        super();

        counter = id;
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Article() {
        super();
        counter++;
        this.id = counter;
        this.name = "Brak nazwy";
        this.description = "Brak opisu";
        this.price = 0.0d;
    }

    protected void printChange(){
        Log.debug("Zmieniono wartosc pola");
    }

    public static void main(String[] args) {

        Article aa = new Article();
        Article a = new Article(3, "Mleko", "Mleko tłuste 3.5%", 3.5);

        System.out.println("Wartość counter:"+Article.counter);

    }

}