import java.util.Scanner;
public class triangletestabstract {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the sides of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        System.out.print("Enter the color of the triangle: ");
        String color = input.next();
        System.out.print("Is the triangle filled (true or false)? ");
        boolean filled = input.nextBoolean();

        Triangleabstract triangle = new Triangleabstract(side1, side2, side3, color, filled);

        System.out.println(triangle.toString());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());
    }
}
