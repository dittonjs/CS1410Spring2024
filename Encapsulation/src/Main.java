public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName());
    }
}

abstract class Person {
    private String firstName;
    private String lastName;

    public String getName() {
        return firstName + " " + lastName;

    }
}

abstract class AcademicParticipant extends Person {
    private int aNumber;

    public int getaNumber() {
        return aNumber;
    }
}

class Student extends AcademicParticipant{


    private String major;
    private boolean gradStudent;

    private float gpa;





    public float getGpa() {
        return gpa;
    }

    public String getMajor() {
        return major;
    }

    public boolean isGradStudent() {
        return gradStudent;
    }
}

class Teacher extends AcademicParticipant{
    private String[] classes;

    private boolean tenureTrack;

}

class Administrator extends Person {
    private String department;
}

class Janitor extends AcademicParticipant {

}
