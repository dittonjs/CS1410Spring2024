import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Account account = new Account();
        Shape shape = new Shape();
        Point point = new Point(1,1);
        writeObjectToFile(account);
        writeObjectToFile(shape);
        writeObjectToFile(point);

        Course course1 = new Course("CS 1410");
        Course course2 = new Course("ENGR 1400");
        System.out.println(course1.compareTo(course2));
//        writeObjectToFile(10);
    }


    public static void writeObjectToFile(Writeable obj) {
        obj.writeToFile();
        // call the objects write to file method
    }

}

interface Writeable {
    void writeToFile();
}

class Account implements Writeable {
    private double balance = 0.0;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void writeToFile() {
        System.out.println("Writing account to file");
    }
}

class Point implements Writeable {
    private double x;
    private double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    @Override
    public void writeToFile() {
        System.out.println("Writing Point to file!");
    }
}

class Shape implements Writeable {
    private ArrayList<Point> points = new ArrayList<>();

    public void draw() {
        // draws the shape
    }

    @Override
    public void writeToFile() {
        System.out.println("Writing Shape to file!");
    }
}

class Course implements Writeable, Comparable {
    private String name;
    public Course(String name) {
        this.name = name;
    }

    @Override
    public void writeToFile() {
        System.out.println("");
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Course other) {
            return name.compareTo(other.name);
        } else {
            throw new RuntimeException("Can't compare objects");
        }
    }
}