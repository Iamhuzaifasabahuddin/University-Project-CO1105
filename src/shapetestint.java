public class shapetestint {
    public static void main(String[] args) {
        Circleint c = new Circleint(4);
        Rectangleint r = new Rectangleint(4, 3);
        ShowArea(c);
        ShowArea(r);
    }

    public static void ShowArea(shapeint s) {
        double area = s.area();
        System.out.println("The area of the shape is " + Math.round(area));
    }
}
