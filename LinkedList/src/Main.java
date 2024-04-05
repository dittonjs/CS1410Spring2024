public class Main {
    public static void main(String[] args) {
        SortedLinkedList<Integer> nums = new SortedLinkedList<>();
        nums.insert(12);
        nums.insert(3);
        nums.insert(34);
        nums.insert(54);
        nums.insert(123);
        nums.insert(1);
        nums.insert(5);
        nums.display();
        System.out.println();
        nums.remove(123);
        nums.remove(12);
        nums.display();
        System.out.println();
        SortedLinkedList<Person> people = new SortedLinkedList<>();
        people.insert(new Person("Joseph", "Ditton"));
        people.insert(new Person("John", "Edwards"));
        people.insert(new Person("Steve", "Petruzza"));
        people.insert(new Person("Vicki", "Allan"));
        people.insert(new Person("Catelyn", "Ditton"));
        people.display();
        Person johnCopy = new Person("John", "Edwards");
        people.remove(johnCopy);
        System.out.println();
        people.display();
    }
}
