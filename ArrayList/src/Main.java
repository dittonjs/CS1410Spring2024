import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Enter dog breed (c or l, exit to quit): ");
            String breed = scanner.next();

            if (breed.equals("exit")) {
                break;
            } else if (breed.equals("c")) {
                dogs.add(new Chihuahua());
            } else if(breed.equals("l")) {
                dogs.add(new Lab());
            } else  {
                System.out.println("Invalid option");
            }

        }

        speakDogs(dogs);
        printList(dogs);
    }

    public static void speakDogs(ArrayList<Dog> dogs) {
        for (Dog dog: dogs) {
            dog.speak();
        }
    }

    public static void printList(ArrayList objs) {
//        for(int i = 0; i < names.size(); i++) {
//            System.out.println(names.get(i));
//        }

        for (Object obj: objs) {
            System.out.println(obj);
        }

//        names.forEach((name) -> {
//            System.out.println(name);
//        });
        // DECLARATIVE
        // Tell your computer what you want
        // Make me a sandwich

        // IMPERATIVE
        // Tell your computer how to accomplish something
        // take bread
        // put on peanut butter
        // put on jelly
        // put on bread
        // put on plate
        // serve me the food
    }
}

abstract class Dog {
    public abstract void speak();
}

class Chihuahua extends Dog {
    @Override
    public void speak() {
        System.out.println("ASDLFJKJASLKDFJ");
    }
}

class Lab extends Dog {
    @Override
    public void speak() {
        System.out.println("Woof");
    }
}