public class Rectangle {
    private double length;
    private double width;

    Rectangle () {
        length = 1;
        width = 1;
    }

    public void setLength(double length) {
        this.length = Math.min(20, Math.max(1, length));
    }

    public void setWidth(double width) {
        this.width = Math.min(20, Math.max(1, width));
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    
}
