
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(10);
        c1.setX(6);
        c1.setY(4);
        System.out.println("The area of c1 is "+c1.area());
        System.out.println("The perimeter of c1 is "+ c1.perimeter());
        System.out.println("Position of the cricle is "+ c1.position());
    }
}
