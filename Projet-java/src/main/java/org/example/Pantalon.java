package org.example;

public class Pantalon extends Clothes{

    // Attribute
    private String color;
    private String type;

    //Constructor
    public Pantalon(int reference, String name, int price, String size, int stock, String color, String type) {
        super(reference, name, price, size, stock);
        setColor(color);
        setType(type);
    }

    // Getter
    public String getColor() {
        return color;
    }
    public String getType() {
        return type;
    }

    //Setter
    public void setColor(String color) {
        this.color = color;
    }
    public void setType(String type) {
        this.type = type;
    }

    // Methods


}