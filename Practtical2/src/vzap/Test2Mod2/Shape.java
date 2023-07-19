package vzap.Test2Mod2;

public abstract class Shape implements Drawing {
    private int xPosition;
    private int yPosition;

    public Shape(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public int getXPosition() {
        return xPosition;
    }

    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    @Override
    public String toString() {
        return "xPosition=" + xPosition + ", yPosition=" + yPosition;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public Shape() {
        this(0, 0);
    }


}