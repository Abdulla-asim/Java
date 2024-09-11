public class Cube extends ThreeDShape {
    private double side;

    public Cube() {
        this(1.0, "green", true);
    }

    public Cube(int side) {

    }

    public Cube(double side, String color, boolean filled) {
        super(side/2f, color, filled);
        this.side = side;
    }

    @Override
    public double getArea() {
        return 6 * side * side;
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public String toString() {
        return "Cube: " + color + " " + "Side: " + side + " " + "Filled: " + filled + " " + "Dimension: 3D";
    }
}
