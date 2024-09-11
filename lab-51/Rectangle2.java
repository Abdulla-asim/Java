public class Rectangle2 extends GeometricObject{
    private double width;
    private double height;

    public Rectangle2() {
        super();
        this.height = 1.0;
        this.width = 1.0;
    }

    public Rectangle2(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    public Rectangle2(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.height = height;
        this.width = width;
    }

    public double getWidth() { return width; }

    public void setWidth(double width) { this.width = width; }

    public double getHeight() { return height; }

    public void setHeight(double height) { this.height = height; }

    public double getArea() { return width * height; }

    public double getPerimeter() { return 2 * (width + height); }

    @Override
    public String toString() { return "Rectangle: " + width + "Height: " + height; }

    public void setLength(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setLength'");
    }

    public String getLength() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLength'");
    }
}
