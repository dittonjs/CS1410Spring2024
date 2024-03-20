import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Comparable> data = new ArrayList<>();
        data.add(new Square(1));
        data.add("1.0");
        data.add(new Circle(1));
        data.add("Erik");
        data.add(new Circle(4));
        data.add(new Circle(6));
        data.add("Aaron");
        data.add(new Circle(3.5));
        data.add("Sophie");
        data.add(new Circle(55.3));
        data.add("Thomas");
        data.add(new Square(3));
        data.add(new Square(89));
        data.add("Catelyn");
        data.add(new Square(34.3));
        data.add(new Square(23.3));
        data.add("Joseph");
        data.add(new Square(5));

//        bubbleSort(data);
        int result = data.get(0).compareTo(data.get(1));
        if ( result < 0) {
            System.out.println("lessThan");
        } else if (result > 0) {
            System.out.println("greaterThan");
        } else {
            System.out.println("Equal");
        }


        for (Comparable c: data) {
            System.out.println(c);
        }

    }


    public static void bubbleSort(ArrayList<Comparable> data) {
        for(int i = 0; i < data.size(); i++) {
            boolean performedSwap = false;
            for (int j = 0; j < data.size() -1 ; j++) {
                if (data.get(j).compareTo(data.get(j+1)) > 0) {
                    Comparable temp = data.get(j);
                    data.set(j, data.get(j+1));
                    data.set(j+1, temp);
                    performedSwap = true;
                }
            }
            if (!performedSwap) {
                return;
            }
        }
    }

}

abstract class Shape implements Comparable {
    abstract double getArea();

    @Override
    public int compareTo(Object o) {
        if (o instanceof Shape other) {
            if (this.getArea() < other.getArea()) {
                return -1;
            } else if (this.getArea() > other.getArea()) {
                return 1;
            } else {
                return 0;
            }
        }
        if (o instanceof String other) {
            return (other.compareTo("" + getArea())) * -1;
        }
        throw new RuntimeException("Cant compare shape to this object");
    }
}

class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle: " + getArea();
    }
}

class Square extends Shape {
    private double size;
    public Square(double size) {
        this.size = size;
    }

    @Override
    double getArea() {
        return size * size;
    }

    @Override
    public String toString() {
        return "Square: " + getArea();
    }
}


