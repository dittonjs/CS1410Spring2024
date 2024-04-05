public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public int compareTo(Person o) {
        int sort = lastName.compareTo(o.lastName);
        if (sort == 0) {
            return firstName.compareTo(o.firstName);
        }
        return sort;
    }
}
