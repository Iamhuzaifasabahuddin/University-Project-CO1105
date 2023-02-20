public class Fan {
    // Constants for fan speed
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private data fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-arg constructor
    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5.0;
        this.color = "blue";
    }

    // Accessor and mutator methods for all data fields
    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString() method to return a string description of the fan
    public String toString() {
        if (this.on) {
            return "Speed: " + this.speed + ", Color: " + this.color + ", Radius: " + this.radius;
        } else {
            return "Color: " + this.color + ", Radius: " + this.radius + ", Fan is off";
        }
    }
}
