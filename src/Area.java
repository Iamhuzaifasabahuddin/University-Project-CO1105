class Area extends Shape {
    // Implement the RectangleArea method
    double RectangleArea(double length, double breadth) {
        return length * breadth;
    }

    // Implement the SquareArea method
    double SquareArea(double side) {
        return side * side;
    }

    // Implement the CircleArea method
    double CircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}