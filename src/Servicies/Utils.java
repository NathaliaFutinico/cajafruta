package Servicies;

import Fruits.Fruit;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Utils {
    public static List<String> selectFruitByLetterD(List<String> fruits){
        List<String> namesFruitD = fruits.stream().filter(x->x.contains("d")).collect(Collectors.toList());

        return namesFruitD;
    }

    public static List<String> createlis(){
        List<String> fruitNames = new ArrayList<String>();
        fruitNames.add("Manzana");
        fruitNames.add("Limon");
        fruitNames.add("Papaya");
        fruitNames.add("Fresa");
        fruitNames.add("Kiwi");
        fruitNames.add("Banano");
        fruitNames.add("Granadilla");
        fruitNames.add("Durazno");
        fruitNames.add("Sandia");
        fruitNames.add("Tomate");
        return fruitNames;
    }

    public static List<Fruit> selectFruitColorRed(List<Fruit> allFruits){
        List<Fruit> redFruits = allFruits.stream().filter(item->item.fruitColor.toLowerCase().equals("ROjo".toLowerCase()) ).collect(Collectors.toList());
        return redFruits;
    }
}
