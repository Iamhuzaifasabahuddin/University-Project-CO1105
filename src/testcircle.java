public class testcircle {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println("The area of c1 is: " + c1.getArea());
        System.out.println("The perimeter of c1 is: " + c1.getPerimeter());
        System.out.println("Does c1 contain the point (3, 3)? " + c1.contains(3, 3));
        System.out.println("Does c1 contain the circle (4, 5, 10.5)? " + c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("Do c1 and (3, 5, 2.3) overlap? " + c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}