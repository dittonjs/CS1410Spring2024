public class Circle {
    private static int numCircles = 0;
    private double radius;
    private double x;
    private double y;

    public Circle(double radius) {
        this(radius, 0, 0);
    }

    public Circle(double radius, double x, double y) {
        setRadius(radius);
        setX(x);
        setY(y);
        Circle.numCircles += 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            radius = 1;
        }
        this.radius = (float)radius;
    }

    public double getX() {
        return x;
    }

    public Circle setX(double x) {
        this.x = x;
        return this;
    }

    public double getY() {
        return y;
    }

    public Circle setY(double y) {
        this.y = y;
        return this;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public static int getNumCircles() {
        return Circle.numCircles;
    }
}
