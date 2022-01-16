package Fruits;

import Fruits.Fruit;

import java.util.ArrayList;
import java.util.List;

public class Box {
    public List<Fruit> fruits = new ArrayList<Fruit>();
    public  List<Fruit> fillBox(){
        fruits.add(new Fruit("Manzana","Rojo",23));
        fruits.add(new Fruit("Manzana","Verde",19));
        fruits.add(new Fruit("Tomate","Rojo",34));
        fruits.add(new Fruit("Limon","Verde",12));
        fruits.add(new Fruit("Limon","Verde",16));
        fruits.add(new Fruit("Papaya","Amarillo",500));
        fruits.add(new Fruit("Limon","Verde",15));
        fruits.add(new Fruit("Fresa","Rojo",6));
        fruits.add(new Fruit("Limon","Verde",13));
        fruits.add(new Fruit("Limon","Verde",13));
        fruits.add(new Fruit("Limon","Verde",13));
        fruits.add(new Fruit("Limon","Verde",13));
        fruits.add(new Fruit("Limon","Verde",13));
        fruits.add(new Fruit("Limon","Verde",13));
        fruits.add(new Fruit("Limon","Verde",13));
        fruits.add(new Fruit("Limon","Verde",13));
        fruits.add(new Fruit("Limon","Verde",13));
        fruits.add(new Fruit("Manzana","Verde",29));
        System.out.println(fruits);
        return fruits;
    }

}
