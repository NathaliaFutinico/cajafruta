
import Fruits.Box;
import Servicies.Utils;
import Fruits.Fruit;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Fruit>x = new Box().fillBox();
        Utils.selectFruit(x);


    }
}
