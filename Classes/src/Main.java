public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(3.4);
        System.out.println(Circle.getNumCircles());
        System.out.printf("Radius of the circle is: %.2f, The area is: %.2f \n", circle.getRadius(), circle.getArea());
        System.out.println(Circle.getNumCircles());
        Circle circle2 = new Circle(4.56f);
        System.out.printf("Radius of the circle is: %.2f\n", circle2.getRadius());

        Circle circle3 = new Circle(-10f);
        System.out.println(Circle.getNumCircles());
        System.out.printf("Radius of the circle is: %.2f\n", circle3.getRadius());
        doSomething(circle3);
        System.out.printf("Radius of the circle is: %.2f\n", circle3.getRadius());
        Circle myCircle = new Circle(1.2, 4.5, 7.3);
        myCircle.setX(3).setY(43);
        System.out.println();

        Circle[] circles = new Circle[10];
        for(int i = 0; i < circles.length; i ++) {
            circles[i] = new Circle(
                    Math.random() * 10,
                    Math.random() * 10,
                    Math.random() * 10
            );
        }
        displayNumCircles();

        for (Circle c: circles) {
            printCircle(c);
        }
    }

    public static void printCircle(Circle c) {
        System.out.printf("Radius of the circle is: %.2f, The area is: %.2f. Its position is (%.2f, %.2f)\n", c.getRadius(), c.getArea(), c.getX(), c.getY());
    }

    public static void doSomething(Circle circle) {
        circle.setRadius(25);
    }

    public static void displayNumCircles() {
        System.out.println(Circle.getNumCircles());
    }
}

