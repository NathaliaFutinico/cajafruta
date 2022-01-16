package Fruits;

import java.util.ArrayList;
import java.util.List;

public class Fruit {
    public String fruitName;
    public String fruitColor;
    public Fruit(String fruitName, String fruitColor){
        this.fruitName = fruitName;
        this.fruitColor = fruitColor;
    }
    public static List<Fruit> listFruit(){
        List<Fruit> allFruits = new ArrayList<Fruit>();
        allFruits.add(new Fruit("Manzana","Rojo"));
        allFruits.add(new Fruit("Manzana","Verde"));
        allFruits.add(new Fruit("Tomate","Rojo"));
        allFruits.add(new Fruit("Limon","Verde"));
        allFruits.add(new Fruit("Cereza","Rojo"));
        allFruits.add(new Fruit("Papaya","Naranja"));
        allFruits.add(new Fruit("Banano","Amarillo"));
        allFruits.add(new Fruit("Fresa","Rojo"));
        allFruits.add(new Fruit("Uva","Morado"));
        allFruits.add(new Fruit("Frambuesa","RojO"));
        return allFruits;
    }
}
