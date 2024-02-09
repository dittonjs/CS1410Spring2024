public class Assignment {
    long dueDate;
    double points;

    String category;

    String description;

    Rubric rubric; // composition

    Submission[] submissions; // aggregation - ownership

    Theme theme;

    Question[] questions;

    public void submitAssignment(Submission submission) {
        // add this to the submissions list
        // grade the assigment
        StudentDatabase.assignGrade(10, submission);
    }

}
