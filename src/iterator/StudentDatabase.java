package iterator;

import java.util.ArrayList;
import java.util.Iterator;

/** This class is the database that adds a student created to an arraylist that can be iterated throught */
public class StudentDatabase implements Iterable<Student> {

        ArrayList<Student> students;


    /** This is the StudentDatabase constructor.*/
	public StudentDatabase() {
            students = new ArrayList<>();
        }

        public void add(String firstName, String lastName, int studentNumber, String programEnrolled) {
            students.add(new Student(firstName, lastName, studentNumber, programEnrolled));
        }


        @Override
        public Iterator<Student> iterator() {
            return new StudentIterator(students);
        }
    }

