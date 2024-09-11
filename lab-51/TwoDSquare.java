public class TwoDSquare extends TwoDShape {
    public TwoDSquare() {
        this(1.0, "green", true);
    }

    public TwoDSquare(double side) {
        this(side, "green", true);
    }

    public TwoDSquare(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    @Override
    public String toString() {
        return "Square: " + color + " " + "Side: " + length + " " + "Filled: " + filled + " " + "Dimension: 2D";
    }
}
