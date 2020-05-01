package iterator;

/** This class creates a student giving it a first and last name, a student number and the name of the program which the student is */
public class Student {
    String firstName;
    String lastName;
    int studentNumber;
    String programEnrolled;

    /** This is the Student constructor */
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

    /**
     * Return this Student information.
     * @return the string representation of the student's last name, first name, student number and the program they are enrolled in.
     */
    public String toString() {
        return ("Name: " + getLastName() + ", " + getFirstName() + "; Student Number: " + getStudentNumber() + "; Program: " + getProgram());
    }
}

