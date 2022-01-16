package Servicies;

import java.util.List;
import java.util.stream.Collectors;

public class Utils {
    public static List<String> selectFruitByLetterD(List<String> fruits){
        List<String> namesFruitD = fruits.stream().filter(x->x.contains("d")).collect(Collectors.toList());

        return namesFruitD;
    }
}
