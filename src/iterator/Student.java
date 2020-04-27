package iterator;

public class Student {
    String firstName;
    String lastName;
    int studentNumber;
    String programEnrolled;


    public Student(String firstName, String lastName, int studentNumber, String programEnrolled) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
        this.programEnrolled = programEnrolled;
    }

    private String getFirstName() { return firstName; }

    private String getLastName() { return lastName; }

    private int getStudentNumber() { return studentNumber; }

    private String getProgram() { return programEnrolled; }

    public String toString() {
        return ("Name: " + getLastName() + ", " + getFirstName() + "; Student Number: " + getStudentNumber() + "; Program: " + getProgram());
    }
}

