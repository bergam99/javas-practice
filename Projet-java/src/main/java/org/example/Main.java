package org.example;

import org.example.Clothes;
import org.example.Pantalon;
import org.example.Vestes;

public class Main {
    public static void main(String[] args) {

        Pantalon jean = new Pantalon(123456, "jean's levis", 25, "S", 20,"blue", "jeans");
        //   Jupes trapeze = new Jupes(11245, "jupe trapeze",12, "L", 10, "long");
        //   Vestes batman = new Vestes(78594, "batman", 150, "M",3,"leather");

        System.out.println("Mon jean's est de couleur " + jean.getColor());
        System.out.println("Mon jean's coute " + jean.getPrice() + " €");

    }
}