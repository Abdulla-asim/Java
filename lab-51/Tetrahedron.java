public class Tetrahedron extends ThreeDShape {
    private double side;

    public Tetrahedron() {
        this(1.0, "green", true);
    }

    public Tetrahedron(double side) {
        this(side, "green", true);
    }

    public Tetrahedron(double side, String color, boolean filled) {
        super(-1.0, color, filled);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * side * side;
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3) * Math.sqrt(2) / 12;
    }

    @Override
    public String toString() {
        return "Tetrahedron: " + color + " " + "Side: " + side + " " + "Filled: " + filled + " " + "Dimension: 3D";
    }
}
