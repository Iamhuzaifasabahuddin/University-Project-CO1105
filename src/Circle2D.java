public class Circle2D {
    private double x;
    private double y;
    private double radius;

    // No-arg constructor
    public Circle2D() {
        x = 0;
        y = 0;
        radius = 1;
    }

    // Constructor with specified x, y, and radius
    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // Getter methods
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getRadius() {
        return radius;
    }

    // Method to get the area of the circle
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Method to get the perimeter of the circle
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Method to check if the specified point is inside this circle
    public boolean contains(double x, double y) {
        double distance = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
        return distance <= radius;
    }

    // Method to check if the specified circle is inside this circle
    public boolean contains(Circle2D circle) {
        double distance = Math.sqrt(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2));
        return distance <= Math.abs(radius - circle.getRadius());
    }

    // Method to check if the specified circle overlaps with this circle
    public boolean overlaps(Circle2D circle) {
        double distance = Math.sqrt(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2));
        return distance <= radius + circle.getRadius();
    }
}
