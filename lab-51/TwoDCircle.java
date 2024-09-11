public class TwoDCircle extends TwoDShape {
    public TwoDCircle() {
        this(1.0, "green", true);
    }

    public TwoDCircle(double radius) {
        this(radius, "green", true);
    }

    public TwoDCircle(double radius, String color, boolean filled) {
        super(radius, radius, color, filled);
    }

    @Override
    public double getArea() { return Math.PI * length * length; }

    @Override
    public double getPerimeter() { return 2 * Math.PI * length; }

    @Override
    public String toString() {
        return "Circle: " + color + " " + "Radius: " + length + " " + "Filled: " + filled + " " + "Dimension: 2D";
    }
}
