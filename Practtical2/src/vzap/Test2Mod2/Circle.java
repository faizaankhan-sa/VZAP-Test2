package vzap.Test2Mod2;

public final class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this(radius, 0, 0);
    }

    public Circle(double radius, int xPosition, int yPosition) {
        super(xPosition, yPosition);
        if (radius < 0) {
            radius = 0;
            setXPosition(0);
            setYPosition(0);
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            radius = 0;
            setXPosition(0);
            setYPosition(0);
        }
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle with " + super.toString() + ", radius=" + radius;
    }

    @Override
    public void draw() {

    }
}
