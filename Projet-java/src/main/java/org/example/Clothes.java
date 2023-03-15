package org.example;

public abstract class Clothes extends Products{


    //Attributes

    protected int reference;
    protected String name;
    protected int price;
    protected String size;
    protected int stock;


    //Constructor
    Clothes(int reference, String name, int price, String size, int stock){
        setReference(reference);
        setName(name);
        setPrice(price);
        setSize(size);
        setStock(stock);
    }

    // Getter
    public int getReference() {
        return reference;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }
    public String getSize() {
        return size;
    }


    //Setter
    public void setReference(int reference) {
        this.reference = reference;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    //Methods



}

