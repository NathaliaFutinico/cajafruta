package Servicies;

import Fruits.Fruit;

import java.util.List;
import java.util.stream.Collectors;

public class Utils {

    public static List<Fruit> selectFruit(List<Fruit> fruits){
        List<Fruit> selectAppleLemon = fruits.stream().filter(item-> item.name.toLowerCase()
                .equals("manzana".toLowerCase()) || item.name.toLowerCase().equals("limon".toLowerCase()))
                .collect(Collectors.toList());

        System.out.println("Limones:  "+weightFruit(selectAppleLemon,"limon"));
        System.out.println("Manzanas:  "+weightFruit(selectAppleLemon,"manzana"));

        while(weightFruit(selectAppleLemon,"limon")> weightFruit(selectAppleLemon,"manzana")){
            selectAppleLemon.add(new Fruit("Manzana","Verde",10));
            System.out.println("Mas una manzana  :  "+weightFruit(selectAppleLemon,"manzana"));
        }

        return selectAppleLemon;
    }

    private static int weightFruit(List<Fruit> fruits, String nameFruit){
        List<Fruit> selectFruits = fruits.stream().filter(i->i.name.toLowerCase()
                        .equals(nameFruit.toLowerCase()))
                .collect(Collectors.toList());
        int weightFruit= 0;

        for (Fruit fruit : selectFruits) {
            weightFruit += fruit.weight;
        }
        return weightFruit;
    }

}
