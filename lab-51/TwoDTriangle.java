public class TwoDTriangle extends TwoDShape{
    double side3;
    public TwoDTriangle() {
        this(1.0, 1.0, "green", true);
    }

    public TwoDTriangle(double base, double height) {
        this(base, height, "green", true);
    }

    public TwoDTriangle(double side1, double side2, String color, boolean filled) {
        super(side1, side2, color, filled);
    }

    @Override
    public double getArea() { 
        double s = (length + width + side3) / 2;
        return s;
    }

    @Override
    public String toString() {
        return "Triangle: " + color + " " + "Base: " + length + " " + "Height: " + width + " " + "Side3: " + side3 + " " + "Filled: " + filled + " " + "Dimension: 2D";
    }
}
