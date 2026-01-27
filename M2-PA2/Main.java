
abstract class GeometricObject {
    private String color = "white";
    private boolean filled;

    protected GeometricObject() {}
    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }

    public abstract double getArea();
    public abstract double getPerimeter();
}

// Triangle class
class Triangle extends GeometricObject {
    private double side1, side2, side3;

    public Triangle(double s1, double s2, double s3) {
        super();
        side1 = s1; side2 = s2; side3 = s3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return "Triangle: side1=" + side1 + ", side2=" + side2 + ", side3=" + side3;
    }
}

// Driver class with main method
public class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(3, 4, 5);
        System.out.println(t1);
        System.out.println("Area: " + t1.getArea());
        System.out.println("Perimeter: " + t1.getPerimeter());
    }
}


