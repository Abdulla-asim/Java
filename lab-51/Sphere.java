public class Sphere extends ThreeDShape{
    public Sphere() {
        this(1.0, "green", true);
    }

    public Sphere(double radius){
        this(radius, "green", true);
    }

    public Sphere(double radius, String color, boolean filled){
        super(radius, color, filled);
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return (4/3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Sphere: " + color + " " + "Radius: " + radius + " " + "Filled: " + filled + " " + "Dimension: 3D";
    }
}
