package vzap.Test2Mod2;

public class Rectangle extends Shape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width, int xPosition, int yPosition) {
        super(xPosition, yPosition);
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length, double width) {
        this(length, width, 0, 0);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle " +
                "length=" + length +
                ",width=" + width +
                ",xPosition=" + getXPosition() +
                ",yPosition=" + getYPosition();
    }

    public boolean equals(Rectangle r) {
        return r.getLength() == length && r.getWidth() == width;
    }

    @Override
    public void draw() {

    }
}