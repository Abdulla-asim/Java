public abstract class ThreeDShape extends Shape{
    protected double radius;

    public ThreeDShape() {
        this(1.0 , "green", true);
    }

    public ThreeDShape(double radius) {
        this(radius, "green", true);
    }

    public ThreeDShape(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public abstract double getArea();

    public abstract double getVolume(); 
}
