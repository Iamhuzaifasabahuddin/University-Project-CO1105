import java.util.Scanner;
public class Mytriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sides of the triangle: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if(a == -1) {
            System.out.println("Bye");
            System.exit(0);
        }
        if (isValid(a, b, c)) {
            System.out.println("Area of triangle is: " + area(a, b, c));
            System.out.println("Perimeter of triangle is:"  + perimeter(a, b, c));
        }
        else {
            System.out.println("Invalid input");
        }



    }
    public static double area(double a, double b, double c){
        double Area = (a + b + c) / 2;
        return Math.sqrt(Area * (Area - a) * (Area - b) * (Area - c));
    }

    public static double perimeter(double a, double b, double c){
        return a+b+c;
    }

    public static boolean isValid(double a, double b, double c){
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}