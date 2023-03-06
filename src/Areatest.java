import java.util.Scanner;
public class Areatest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Area area = new Area();


        System.out.print("Enter the length and breadth of the rectangle: ");
        double length = input.nextDouble();
        double breadth = input.nextDouble();


        double rectangleArea = area.RectangleArea(length, breadth);
        System.out.println("Area of the rectangle is: " + rectangleArea);


        System.out.print("Enter the side of the square: ");
        double side = input.nextDouble();


        double squareArea = area.SquareArea(side);
        System.out.println("Area of the square is: " + squareArea);


        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        double circleArea = area.CircleArea(radius);
        System.out.println("Area of the circle is: " + circleArea);
    }
}
