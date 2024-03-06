public class Main {
    public static void main(String[] args) {
        int[][] ragged = {
                {1},
                {2,3,4,5},
                {3,4}
        };



        int a = 10;
        Integer b = a;

        boolean value = b < 10;






        StringBuilder builder = new StringBuilder();
        builder.append(10)
                .append("\n")
                .append(true);


        double num = Math.pow(2,34);



        int[][][][][] data = new int[2][2][2][2][2];

        Circle[] circles = new Circle[5];

        Circle c  = new Circle(3);
        if (c instanceof Circle) {
            System.out.println("I am a circle");
        } else if (c instanceof Shape) {
            System.out.println("I am a shape");
        }


//        System.out.println(c.getRadius());
//        changeRadius(c);
//        System.out.println(c.getRadius());
//
//        System.out.println(circles[2]);
    }

    public static void changeRadius(Circle c) {
        c
                .setRadius(10)
                .setRadius(12)
                .setRadius(15);
    }

    public static int[][] makeArray() {
        return new int[3][];
    }

    public static Circle makeCircle() {
        Circle circle = new Circle(3);
        return circle;
    }
}

class Shape {

}

class Circle extends Shape {

    private double radius;
    public Circle(double radius) {
        this.radius = radius;
        setRadius(1);
    }

    public Circle setRadius(double radius) {
        this.radius = radius;
        return this;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}