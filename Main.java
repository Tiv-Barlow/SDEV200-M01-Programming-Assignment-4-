//SDEV 200 - Software Development Using Java
//Professor Adam Bumgardner
//Student: Tiv Muhammad
//24 Mar 2024
// Assignment: Mod1 Programming Assignment (4) 9.9
/*-------------------------------------------------------*/

public class Main {
    // Private data variables
    private int n; // Number of sides
    private double side; // Length of side
    private double x; // x-coordinate of center
    private double y; // y-coordinate of center

    //The folowing "No-argument constructor", creates a regular polygon with DEFAULT values
    public Main() {
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }

    //Constructors with specific number of sides and length of side, centered at (0, 0)
    public Main(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    //Constructors with specific number of sides, length of side, AND coordinates of center
    public Main(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    //The accessor method returns the number of sides
    public int getN() {
        return n;
    }

    //The mutator method is used for the number of sides
    public void setN(int n) {
        this.n = n;
    }

    //The Accessor method returns length of side
    public double getSide() {
        return side;
    }

    //The mutator method is used for the length of side
    public void setSide(double side) {
        this.side = side;
    }

    // Accessor method for x-coordinate of center
    public double getX() {
        return x;
    }

    // Mutator method for x-coordinate of center
    public void setX(double x) {
        this.x = x;
    }

    // Accessor method for y-coordinate of center
    public double getY() {
        return y;
    }

    // Mutator method for y-coordinate of center
    public void setY(double y) {
        this.y = y;
    }

    // Method to calculate perimeter of the polygon
    public double getPerimeter() {
        return n * side;
    }

    // Method to calculate area of the polygon
    public double getArea() {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }

    // Main method to test the RegularPolygon class
    public static void main(String[] args) {
          Main polygon1 = new Main();
          Main polygon2 = new Main(6, 4);
          Main polygon3 = new Main(10, 4, 5.6, 7.8);

        System.out.println("Polygon 1:");
        System.out.println("Perimeter: " + polygon1.getPerimeter());
        System.out.println("Area: " + polygon1.getArea());

        System.out.println("\nPolygon 2:");
        System.out.println("Perimeter: " + polygon2.getPerimeter());
        System.out.println("Area: " + polygon2.getArea());

        System.out.println("\nPolygon 3:");
        System.out.println("Perimeter: " + polygon3.getPerimeter());
        System.out.println("Area: " + polygon3.getArea());
    }
}
