
import Servicies.Utils;
import Fruits.Fruit;


public class Main {
    public static void main(String[] args) {

        Utils.selectFruitColorRed(Fruit.listFruit()).forEach(r->{
            System.out.println(r.fruitName);
        });

    }
}
