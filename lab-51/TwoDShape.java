public class TwoDShape extends Shape{
    protected double length;
    protected double width;

    public TwoDShape() {
        this(1.0, 1.0, "green", true);
    }

    public TwoDShape(double width, double height) {
        this(width, height, "green", true);
    }

    public TwoDShape(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.length = width;
        this.width = height;
    }

    public double getArea() { return length * width; }

    public double getPerimeter() { return 2 * (length + width); }

    @Override
    public String toString() {
        return "Two Dimensional Shape: "  + color + " " + "Width: " + length + " " + "Height" + width + " " + "Filled: " + filled + " " + "Dimension: 2D";
    }
}
