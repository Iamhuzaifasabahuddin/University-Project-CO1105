public class Trianglept2 {

    private double side1;
    private double side2;
    private double side3;
    private String color;
    private Boolean filled;
    public Trianglept2() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
        this.color = "Black";
    }
    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }
    public double getSide3() {
        return side3;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setfilled(Boolean filled) {
        this.filled = filled;
    }
    public Boolean getFilled() {
        return filled;
    }
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getarea(){
        double Area = (this.side1 + this.side2 + this.side3) / 2;
        return Math.sqrt(Area * (Area - this.side1) * (Area - this.side2) * (Area - this.side3));
    }
    public double getperimeter(){
        return (this.side1 + this.side2 + this.side3);
    }
    public String toString() {
        if (this.filled) {
            return "Triangle has sides: " + this.side1 + ", " + this.side2 + ", " + this.side3 + " And has colour " + this.color.toLowerCase() +
                    " and is filled " + " and has area and perimeter of " + getarea()+ " " +getperimeter();
        } else {
            return "Triangle has sides: " + this.side1 + ", " + this.side2 + ", " + this.side3 + " Colour of " + this.color.toLowerCase() +
                    " and isnt filled "+" and has area and perimeter of " + getarea() + " " +  getperimeter();
        }
    }
}
