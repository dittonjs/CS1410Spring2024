public class Main {
    public static void main(String[] args) {
//        Dog dog = new Dog();
        GermanShepard gs = new GermanShepard();
        Dachshund dachshund = new Dachshund();
        Chihuahua chihuahua = new Chihuahua();

        gs.hunt();


        Dog someDog = new GermanShepard();
        someDog.bark();



        makeDogSpeak(dachshund);
        makeDogSpeak(gs);
        makeDogSpeak(chihuahua);

    }

    public static void makeDogSpeak(Dog dog) {
        dog.bark();
        dog.hunt();
    }
}

abstract class Dog {
    public abstract void bark();
}

class GermanShepard extends Dog {
    @Override
    public void bark() {
        System.out.println("BAAAAAAAAARK");
    }

    public void hunt() {}
}

class Chihuahua extends Dog {
    @Override
    public void bark() {
        System.out.println("12kli3uhefoLIZAJXDbfr901");
    }
}

class Dachshund extends Dog {
    @Override
    public void bark() {
        System.out.println("Woooooffff");
    }
}
