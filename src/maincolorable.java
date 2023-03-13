public class maincolorable {
    public static void main(String[] args) {
            Squareabs square = new Squareabs(5.0);
            System.out.println("Square side length: " + square.getSide());
            System.out.println("Square area: " + square.getArea());
            System.out.println("Square perimeter: " + square.getPerimeter());
            square.howToColor();
            }
}
