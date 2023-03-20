public class Fruitbaskettest {
    public static void main(String[] args) {
        Fruitbasket<Apple> appleBasket = new Fruitbasket<>();
        try {
            appleBasket.add(new Apple(0.5));
            appleBasket.add(new Apple(1.5));
            appleBasket.add(new Apple(2.0)); // This will raise an exception
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Total weight of apples in basket: " + appleBasket.getWeight());

        Fruitbasket<Peach> peachBasket = new Fruitbasket<>();
        try {
            peachBasket.add(new Peach(1.0));
            peachBasket.add(new Peach(1.0));
            peachBasket.add(new Peach(1.0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Total weight of peaches in basket: " + peachBasket.getWeight());

        Fruitbasket<Orange> orangeBasket = new Fruitbasket<>();
        try {
            orangeBasket.add(new Orange(1.5));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Total weight of oranges in basket: " + orangeBasket.getWeight());
    }
}