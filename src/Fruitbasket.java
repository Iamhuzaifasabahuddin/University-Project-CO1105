import java.util.ArrayList;
public class Fruitbasket<T extends Fruit> {
    private ArrayList<T> fruits;
    private double totalWeight;
    private final double MAX_WEIGHT = 5;

    public Fruitbasket() {
        fruits = new ArrayList<>();
        totalWeight = 0;
    }

    public double getWeight() {
        return totalWeight;
    }

    public void add(T fruit) throws Exception {
        double fruitWeight = fruit.getWeight();
        if (totalWeight + fruitWeight > MAX_WEIGHT) {
            throw new Exception("Basket is full!");
        }
        fruits.add(fruit);
        totalWeight += fruitWeight;
    }
}