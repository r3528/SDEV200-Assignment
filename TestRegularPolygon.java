public class TestRegularPolygon {
    public static void main(String[] args) {

        RegularPolygon p1 = new RegularPolygon();
        RegularPolygon p2 = new RegularPolygon(6, 4);
        RegularPolygon p3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Polygon 1:");
        System.out.println("Perimeter = " + p1.getPerimeter());
        System.out.println("Area = " + p1.getArea());

        System.out.println("\nPolygon 2:");
        System.out.println("Perimeter = " + p2.getPerimeter());
        System.out.println("Area = " + p2.getArea());

        System.out.println("\nPolygon 3:");
        System.out.println("Perimeter = " + p3.getPerimeter());
        System.out.println("Area = " + p3.getArea());
    }
}

class RegularPolygon {

    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    public RegularPolygon() {
    }

    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter() {
        return n * side;
    }

    public double getArea() {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }
}


