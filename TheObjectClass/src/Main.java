public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Object circle2 = new Circle(10);
        System.out.println(circle2);

        if (circle.equals(circle2)) {
            System.out.println("They are equal");
        } else {
            System.out.println("Not equal");
        }

        System.out.println(circle);

    }
}


class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle other = (Circle) obj;
            return this.getRadius() == other.getRadius();
        }

        // not a circle, therefore not equal
        return false;
    }

    @Override
    public String toString() {

        return String.format(
                "Circle(r=%.2f):\n  area: %.2f\n  circumference: %.2f",
                radius,
                area(),
                circumference()
        );
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }
}