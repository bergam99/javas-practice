package org.example;

public class Vestes extends Clothes{

    // Attribute
    private String matiere;


    //Constructor
    public Vestes(int reference, String name, int price, String size, int stock, String matiere) {
        super(reference, name, price, size, stock);
        setMatiere(matiere);
    }

    // Getter
    public String getMatiere() {
        return matiere;
    }

    //Setter
    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

}
