public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];
        shapes[0] = new TwoDSquare(5.0, "blue", true);
        shapes[1] = new TwoDTriangle(4.0, 5.0, "green", true);
        shapes[2] = new TwoDCircle(3.0, "red", true);
        shapes[3] = new Cube(4.0, "yellow", true);
        shapes[4] = new Sphere(3.0, "orange", true);
        shapes[5] = new Tetrahedron(3.0, "purple", true);

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Area: " + shape.getArea());
            if (shape instanceof ThreeDShape) {
                System.out.println("Volume: " + ((ThreeDShape) shape).getVolume());
            }
            System.out.println();
        }
    }
}
